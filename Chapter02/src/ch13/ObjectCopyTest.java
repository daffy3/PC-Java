package ch13;

public class ObjectCopyTest {
    public static void main(String[] args) {
        // 배열을 생성한다고 객체가 생성되는 건 아니고, 초기값은 모두 null로 출력이 된다.
        Book[] library = new Book[5];
        Book[] copyLibrary1 = new Book[5];
        Book[] copyLibrary2= new Book[5];


        library[0] = new Book("태백산맥1", "조정래1");
        library[1] = new Book("태백산맥2", "조정래2");
        library[2] = new Book("태백산맥3", "조정래3");
        library[3] = new Book("태백산맥4", "조정래4");
        library[4] = new Book("태백산맥5", "조정래5");

        System.arraycopy(library, 0, copyLibrary1, 0, 5);

        copyLibrary2[0] = new Book();
        copyLibrary2[1] = new Book();
        copyLibrary2[2] = new Book();
        copyLibrary2[3] = new Book();
        copyLibrary2[4] = new Book();

        for (int i = 0; i < library.length; i++) {
            copyLibrary2[i].setTitle(library[i].getTitle());
            copyLibrary2[i].setAuthor(library[i].getAuthor());
        }

        System.out.println("=============== 깊은복사 copyLibrary2 ===============");
        for (Book book : copyLibrary2) {
            System.out.println(book);
            book.showInfo();
        }

        library[0].setAuthor("박완서"); // library와 copyLibrary의 데이터가 모두 변경되었다.
        library[0].setTitle("나목"); // 얕은복사 - shallow copy

        System.out.println("=============== 원본 library ===============");
        for (Book book : library) {
            System.out.println(book);
            book.showInfo();
        }

        System.out.println("=============== 얕은복사 copyLibrary1 ===============");
        for (Book book : copyLibrary1) {
            System.out.println(book);
            book.showInfo();
        }
    }
}
