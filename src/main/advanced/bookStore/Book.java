package main.advanced.bookStore;

import main.advancedCoding.test_19_01_05.UserAccount;

import java.util.Objects;

public class Book {

    private String name;
    private String author;
    private int year;
    private BookGenre genre;
    private float price;


    @Override
    // If two objects are equal by equals() method
    // then there hashcode returned by hashCode() method must be same.
    public boolean equals(Object other) {

        // common part to all equals implementations
        if (this == other) return true;

        if (other == null) return false;
        if (!(other instanceof Book))return false;
        // end common part

        Book otherBook = (Book)other;

        return this.name.equals(otherBook.getName())
                && this.author.equals(otherBook.getAuthor())
                && this.genre.equals(otherBook.getGenre())
                && (this.year == (otherBook.getYear()))
                && (this.price == otherBook.getPrice());
    }


    @Override
    public int hashCode() {

        return Objects.hash(
                this.name,
                this.author,
                this.genre,
                this.year,
                this.price);
    }


    @Override
    public String toString() {

        return String.format(" | %25s | %25s | %d | %10s | %.2f",
                name,
                author,
                year,
                genre,
                price);
    }


    public Book(
            String name,
            String author,
            int year,
            BookGenre genre,
            float price) {

        this.name = name;
        this.author = author;
        this.year = year;
        this.genre = genre;
        this.price = price;
    }

    public String getName() {
        return name;
    }


    public String getAuthor() {
        return author;
    }


    public int getYear() {
        return year;
    }


    public BookGenre getGenre() {
        return genre;
    }


    public float getPrice() {
        return price;
    }


    public void setPrice(float price) {
        this.price = price;
    }
}
