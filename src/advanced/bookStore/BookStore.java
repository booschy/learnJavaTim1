package advanced.bookStore;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class BookStore {

/*    - a map of books with unique id (a random string of 4 digits).
            - a map of book quantities (key=bookId, value=quantity)

    Create an empty book store.*/

    private Map<String, Book> bookMap;
    private Map<String, Integer> quantityMap;


    public BookStore(Map<String, Book> bookMap,
                     Map<String, Integer> quantityMap) {

        this.bookMap = bookMap;
        this.quantityMap = quantityMap;
    }


    public boolean isBookInStore(Book book){

        return bookMap.values().contains(book);
    }


    public String getBookId(Book currentBook){

        List<String> books = bookMap.entrySet().stream()
                .filter(entry -> entry.getValue().equals(currentBook))
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

        if (books.isEmpty()){
            return "0000";
        }

        return books.get(0);

    }


    public void addBook(Book book){

        if(isBookInStore(book)){

        }

        String bookId = generateBookId();
    }


    public static String generateBookId() {
        return "" + (int)(Math.random() * 10000);
    }


    public String generateUniqId() throws Exception {

        final int totalRetries = 1000;

        String id = "";

        for (int i = 0; i < 1000; i++) {

            id = BookStore.generateBookId();

            if (bookMap.keySet().contains(id)){
                break;
            }
        }


        if(id.isEmpty()){
            throw new Exception("Cannot generate ID for new book.");
        }

        return id;
    }


}
