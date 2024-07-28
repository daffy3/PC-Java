package com.daffy3.ch01;

public class BinaryTest {
    public static void main(String[] args) {
        // 정수를 표현하는 자료형: int
        // 여기서 = 은 대입연산자로서, num이 10이다 라는 뜻이 아니라
        // num이라는 변수에 10을 대입한다 라는 개념으로 이해해야 한다.

        int num = 10; // num이라는 변수에 10이라는 값을 대입
        int bNum = 0B1010; // 식별자 앞에 0B을 붙여 작성하면 이 값은 2진수임을 나타낸다.
        int oNum = 012; // 식별자 앞에 0을 붙여 작성하면 이 값은 8진수임을 나타낸다.
        int xNum = 0XA; // 식별자 앞에 0X를 붙여 작성하면 이 값은 16진수를 나타내며 10은 A로 작성한다.

        System.out.println(num); // 10
        System.out.println(bNum); // 10
        System.out.println(oNum); // 10
        System.out.println(xNum); // 10
    }
}
