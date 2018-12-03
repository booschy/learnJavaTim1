package advanced.bookStore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class BookStoreTest {

    final String notFoundId = "0000";

    String random;

    BookStore bookStore;

    Book book1;
    String book1Id;
    Book book2;
    String book2Id;
    Book book3;
    String book3Id;


    @BeforeEach
    public void beforeEach(){

        book1 = new Book(
                "name2",
                "author",
                2000,
                BookGenre.CHILDREN, 100f);

        book1Id = "1111";

        book2 = new Book(
                "name2",
                "author",
                2000,
                BookGenre.CHILDREN,
                100f);

        book2Id = "1112";

        book3 = new Book(
                "name3",
                "author",
                2000,
                BookGenre.CHILDREN,
                100f);

        book3Id="1113";


        // Random
        random = BookStore.generateBookId();

        // Mocked bookStore
        Map<String, Book> booksMap = new HashMap<>();



        booksMap.put(book1Id, book1);
        booksMap.put(book2Id, book2);

        Map<String, Integer> quantityMap = new HashMap<>();
        quantityMap.put(book1Id, 10);
        quantityMap.put(book2Id, 5);


        bookStore = new BookStore(booksMap, quantityMap);
    }


    @Test
    public void test_random_length(){

        Assertions.assertEquals(4, random.length());
        // Assertions.assertEquals(3, random.length());   // fail
    }


    @Test
    public void test_random_contains_digits_only(){
        //random="11a1"; // fail
        Integer.parseInt(random);
    }


    @Test
    public void test_BookStore_isBookInStore_positive()
    {
        Assertions.assertEquals(
                true,
                bookStore.isBookInStore(book1));
    }


    @Test
    public void test_isBookInStore_negative(){
        Assertions.assertEquals(
                false,
                bookStore.isBookInStore(book3));
    }


    @Test
    public void test_getBookId_for_existing_book(){

        Assertions.assertEquals(
                book1Id,
                bookStore.getBookId(book1));
    }


    @Test
    public void test_getBookId_for_non_existing_book(){


        Assertions.assertEquals(
                notFoundId,
                //"0001", // fail
                bookStore.getBookId(book3));
    }

}
