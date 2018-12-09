package advanced.bookStore;

import org.junit.jupiter.api.Assertions;
import utils.FileUtils;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BookStore {

/*    - a map of books with unique id (a randomBookId string of 4 digits).
            - a map of book quantities (key=bookId, value=quantity)

    Create an empty book store.*/

    private Map<String, Book> bookMap;
    private Map<String, Integer> quantityMap;


    public BookStore(Map<String, Book> bookMap,
                     Map<String, Integer> quantityMap) {

        this.bookMap = bookMap;
        this.quantityMap = quantityMap;
    }

    public BookStore(){

        this(
                new HashMap<String, Book>(),
                new HashMap<String, Integer>()
        );

    }

    public static BookInfo bookStringToBookInfo(String bookString) {

        String[] bookStringTokens = bookString.split("\\s*\\|\\s*");


        Assertions.assertEquals(6, bookStringTokens.length);

        return new BookInfo(

                new Book(
                        // book name
                        bookStringTokens[0],

                        // author
                        bookStringTokens[1],

                        // year
                        Integer.valueOf(bookStringTokens[2]),

                        // genre
                        BookGenre.valueOf(bookStringTokens[3].toUpperCase()),

                        // price
                        Float.valueOf(
                                bookStringTokens[4].replaceAll(
                                        "\\s*\\$\\s*",
                                        ""))
                ),
                Integer.valueOf(bookStringTokens[5])
        );
    }


    public boolean isBookInStore(Book book){
        // wrong - compares objects
        return bookMap.values().contains(book);
        //return true;

    }


    public int getQuantity(Book book){

        int quantity = 0;

        if(isBookInStore(book)){
            String bookId = getBookId(book);
            quantity = quantityMap.get(bookId);
        }

        return quantity;
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


    public void addBook(Book book, int quantity){

        if(isBookInStore(book)){

            String bookId = getBookId(book);

            int newQuantity = getQuantity(book) + quantity;

            quantityMap.put(bookId, newQuantity);

        }
        else{
            // book is not in store

            String bookId = generateBookId();

            bookMap.put(bookId, book);

            quantityMap.put(bookId, quantity);
        }

    }


    public void addBook(Path filepath) throws IOException {

        List<String> bookLines = FileUtils.fileLinesToList(filepath);

        //"The Hunger Games | Suzanne Collins | 2008 | FICTION | 11.25 $ | 20" -> BookInfo(...)
        List<BookInfo> bookInfoList = bookLines.stream()
                .filter(bookLineIsNotCommented)
                .filter(bookLineIsNotEmpty)
                .map(bookLine -> bookStringToBookInfo(bookLine))
                .collect(Collectors.toList());

        bookInfoList.forEach(bookInfo -> addBook(
                bookInfo.getBook(),
                bookInfo.getQuantity()));

        //TODO unit test
    }

    public Predicate<String> bookLineIsNotCommented = bookLine ->
            false == bookLine.startsWith("//");

    public Predicate<String> bookLineIsNotEmpty = bookLine ->
            false == bookLine.isEmpty();


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



    public String toString(){

        return bookMap.keySet().stream()
                .map(keyToBookInfo)
                .collect(Collectors.joining("\n"));
    }

    public Function<String, String> keyToBookInfo = key ->

            String.format("%s %s | quantity: %d",
                        key,
                        bookMap.get(key),
                        quantityMap.get(key));

    // #4 Searches
    public List<BookInfo> searchBookByName(String bookName){

        return bookMap.keySet().stream()

                .filter(key -> bookMap.get(key).getName().equals(bookName))
                // stream of keys (String)

                .map(key -> bookMap.get(key))
                // stream of values (Book)

                .map(book -> new BookInfo(book, getQuantity(book)))
                // stream of BookInfo

                .collect(Collectors.toList());
    }

    public List<BookInfo> searchBookByAuthor(String bookAuthor) {

        return bookMap.keySet().stream()

                .filter(key -> bookMap.get(key).getAuthor().equals(bookAuthor))
                // stream of keys (String)

                .map(key -> bookMap.get(key))
                // stream of values (Book)

                .map(book -> new BookInfo(book, getQuantity(book)))
                // stream of BookInfo

                .collect(Collectors.toList());
    }
}
