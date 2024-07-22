package ch13;

public class BookTest {
    public static void main(String[] args) {
        // 배열을 생성한다고 객체가 생성되는 건 아니고, 초기값은 모두 null로 출력이 된다.
        Book[] library = new Book[5];

        library[0] = new Book("태백산맥1", "조정래1");
        library[1] = new Book("태백산맥2", "조정래2");
        library[2] = new Book("태백산맥3", "조정래3");
        library[3] = new Book("태백산맥4", "조정래4");
        library[4] = new Book("태백산맥5", "조정래5");

        for (Book book : library) {
            System.out.println(book);
            book.showInfo();
        }
    }
}
