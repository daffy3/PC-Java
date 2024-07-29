package ch03;

public class Intro {
    // 03. String, StringBuilder, StringBuffer 클래스와 Text Block

    // String 클래스
    // - String 선언하기
    String str1 = new String("abc"); // --> 힙 메모리에 할당
    String str2 = "abc"; // --> 상수 풀에 할당
    // - 힙 메모리에 인스턴스로 생성되는 경우와 상수 풀(constant pool)에 있는 주소를 참조하는 두 가지 방법
    // - 힙 메모리는 생성될 때마다 다른 주소 값을 가지지만, 상수 풀의 문자열은 모두 같은 주소 값을 가진다.

    // 한 번 생성된 String은 불변(immutable)
    // String을 연결하면 기존의 String에 연결되는 것이 아닌 새로운 문자열이 생성된다. (메모리 낭비가 발생할 수도 있다.)
}
