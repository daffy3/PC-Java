package com.daffy3.ch12;

import java.util.Scanner;

public class SwitchCaseUpTest {

    // Java14부터 지원되는 Switch Expression
    // - 간단하게 쉼표로 조건 구분
    // - 식으로 표현하며 반환 값을 받을 수 있다. 리턴 값이 없는 경우는 오류가 생긴다.
    // - yield 키워드를 사용한다.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();
        int day;

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> day = 31;
            case 2 -> day = 28;
            case 4, 6, 9, 11 -> day = 30;
            default -> {
                System.out.println("존재하지 않는 달입니다.");
                day = -1;
            }
        }

        System.out.println(month + "월은 " + day + "일 입니다.");

    }

}
