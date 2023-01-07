package TataStrive.Classwork.Array.BookManagementSystem;

public class Book {
    private int  bookId;
    private String bookName;
    private double bookPrice;

    public int getBookId() {
        return bookId;
    }
    public String getBookName() {
        return bookName;
    }
    public double getBookPrice() {
        return bookPrice;
    }

    public Book(int bookId, String bookName, double bookPrice) {
        super();
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }
}
