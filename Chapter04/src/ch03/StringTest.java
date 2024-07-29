package ch03;

public class StringTest {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1 == str2); // false, str1과 str2는 각각 다른 힙 메모리 주소에 할당되기 때문에

        // ====================================================================================================

        String str3 = "abc";
        String str4 = "abc";

        System.out.println(str3 == str4); // true, 상수 풀에 저장되어 있는 호출하는 개념이기 때문에
    }
}
