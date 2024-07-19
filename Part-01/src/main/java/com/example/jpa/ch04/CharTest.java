package com.example.jpa.ch04;

public class CharTest {
    // 자료형(Data Type) - 문자는 프로그램에서 어떻게 표현하여 사용할까?
    // 문자도 정수로 표현한다.
    // - 어떤 문자를 컴퓨터 내부에서 표현하기 위해 특정 값을 정의
    // - A는 65
    //   A -> 65: 인코딩
    //   65 -> A: 디코딩

    // 자바에서는 문자가 어떻게 표현될까?
    // - 자바는 문자를 나타내기 위해 전세계 표준인 UNICODE를 사용
    // - utf-16 인코딩을 사용(모든 문자를 2바이트로 표시)

    // 문자형 변수 선언과 사용하기
    // - 문자를 위한 데이터 타입 char ch = 'A'
    // - 내부적으로 숫자로 표현되므로 숫자를 넣어도 문자가 출력될 수 있다.

    // 'A'는 2바이트 문자이고, "A"는 문자열이라고 한다.
    // String이라는 클래스에서 문자열을 제공한다.

    public static void main(String[] args) {
        char ch1 = 'A';
        System.out.println(ch1); // A
        System.out.println((int)ch1); // 65 - A를 형변환

        char ch2 = 66;
        System.out.println(ch2); // B
        System.out.println((char) ch2); // B

        int ch3 = 67;
        System.out.println(ch3);
        System.out.println((char) ch3);
    }

}
