package advanced.bookStore;

import java.util.HashMap;

public class BookStoreApplication {


    public static void main(String[] args) {

        BookStore bookStore = new BookStore(
                new HashMap<String, Book>(),
                new HashMap<String, Integer>()
        );
    }



}
