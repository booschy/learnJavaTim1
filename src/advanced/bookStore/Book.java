package advanced.bookStore;

public class Book {

    private String name;
    private String author;
    private int year;
    private BookGenre genre;
    private float price;

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
