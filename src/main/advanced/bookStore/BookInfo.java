package main.advanced.bookStore;

import java.util.Objects;

public class BookInfo {

    Book book;
    Integer quantity;


    public BookInfo(Book book, Integer quantity) {
        this.book = book;
        this.quantity = quantity;
    }


    public Book getBook() {
        return book;
    }


    public Integer getQuantity() {
        return quantity;
    }


    @Override
    // If two objects are equal by equals() method
    // then there hashcode returned by hashCode() method must be same.
    public boolean equals(Object other) {

        // common part to all equals implementations
        if (this == other) return true;

        if (other == null) return false;
        if (!(other instanceof Book))return false;
        // end common part


        final BookInfo otherBookInfo = (BookInfo) other;

        return Objects.equals(this.book, otherBookInfo.book)

                && Objects.equals(this.quantity, otherBookInfo.quantity);
    }


    @Override
    public int hashCode() {

        return Objects.hash(
                this.book,
                this.quantity);
    }


    @Override
    public String toString() {

        return book.toString() + " | " + quantity;
    }
}
