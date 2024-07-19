package com.example.jpa.ch09;

import java.util.Scanner;

public class ConditionTest {
    // 조건연산자
    // - 삼항연산자
    // - 조건식의 결과가 True(참)인 경우와 False(거짓)인 경우에 따라 다른 결과가 수행된다.
    // - if(조건문)을 간단히 표현할 때 사용할 수 있다.
    // 조건식 ? 결과1 : 결과2 -> 조건식이 참이면 결과1, 조건식이 거짓이면 결과2가 선택된다.

    public static void main(String[] args) {
        int max;
        System.out.println("두 수를 입력 받아서 더 큰 수를 출력하세요. \n");

        Scanner scanner = new Scanner(System.in); // System.in: 표준 입력, System.out: 표준 출력

        System.out.println("입력 1: ");
        int num1 = scanner.nextInt();

        System.out.println("입력 2: ");
        int num2 = scanner.nextInt();

        max = (num1 > num2) ? num1 : num2;
        System.out.println(max);

    }
}