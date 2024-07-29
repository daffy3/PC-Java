package ch01;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + "," + author;
    }
}

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("데미안", "헤르만 헤세");
        System.out.println(book); // ch01.Book@3b07d329 --> toString Override 하기 전
        System.out.println(book.toString()); // 데미안,헤르만 헤세 --> toString Override 한 후

        // ====================================================================================================

        String str = new String("test");
        System.out.println(str); // test
        System.out.println(str.toString()); // test
    }
}
