package com.example.jpa.ch03;

public class DoubleTest {
    // 자료형(Data Type) - 실수는 어떻게 표현할까?
    // 부동소수점 방식
    // - 실수는 정수보다 정밀하기 때문에 정수와는 다른 방식으로 표현해야 한다.
    // - 부동소수점 방식으로 실수 값 0.1을 표현

    // 부동소수점 방식의 오류
    // - 지수와 가수로 나타내는 부동 소수점 방식에서는 지수부가 0을 표현할 수 없기 대문에 약간의 오차가 발생할 수 있다.

    public static void main(String[] args) {
        double dNum = 3.14;
        float fNum = 3.14F;
        System.out.println("dNum = " + dNum);
        System.out.println("fNum = " + fNum);
    }
}
