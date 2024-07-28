package ch13;

public class Book {
    private String title;
    private String author;

    // Default Constructor
    public Book() {
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void showInfo() {
        System.out.println("책의 제목은 " + title + "이고, 저자는 " + author + "님 입니다.");
    }
}
