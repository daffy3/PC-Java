package com.daffy3.ch14;

import java.util.Scanner;

public class Intro {
    // 18. 반복문 do-while문

    // 조건과 상관없이 한 번은 수행문을 수행
    // - while문은 조건을 먼저 체크하고 반복 수행이 된다면, do-while은 조건과 상관없이 수행을 한 번 하고나서 조건을 체크
    // - 조건이 맞지 않으면 더 이상 수행하지 않음

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input;
        int sum = 0;

        input = scanner.nextInt();

        while (input != 0) {
            sum += input;
            input = scanner.nextInt();
        }

        // ==============================
        // 위 while문을 아래 do-while문으로 변경
        // ==============================

        do {
            input = scanner.nextInt();
            sum += input;
        } while (input != 0);

        System.out.println(sum);

    }

}
