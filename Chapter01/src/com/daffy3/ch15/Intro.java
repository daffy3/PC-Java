package com.daffy3.ch15;

public class Intro {

    // 19. 반복문 for

    // 먼저, 각각의 반복문은 언제 사용할까요?
    // - while문: 조건이 참인 동안 반복수행. 조건이 맞지 않으면 수행되는 부분이 없음.
    // - do-while문: 조건이 참은 동안 반복 수행. 수행문을 먼저 수행하고 조건 체크
    // - for문: 초기화, 조건체크, 증감 순으로 수행

    // 그렇다면 각각의 반복문의 역할 및 쓰임은 무었일까요?
    // - while문: 조건식의 결과나 변수가 true, false 값인 경우 주로 사용
    // - do-while문: 조건식의 결과나 변수가 true, false 값인 경우 주로 사용
    // - for문: 특정 수의 범위횟수와 관련하여 반복되는 경우 주로 사용, 배열과 함께 많이 사용된다.

    // 중첩 반복문이란?
    // - 반복문 내부에 또 다른 반복문이 있다.
    // - 여러 겹으로 반복문을 겹쳐서 구현 가능
    // - 외부 반복문과 내부 반복문 간의 변수 값 변화에 유의하며 구현하여야함

    public static void main(String[] args) {

        int dan = 2;
        int count = 1;

        for (; dan <= 9; dan++) {
            for (count = 1; count <= 9; count++) {
                System.out.println(dan + "X" + count + "=" + dan * count);
            }
            System.out.println();
        }

        // ====================================================================================================

        dan = 2;
        count = 1;

        while (dan <= 9) {
            count = 1;
            while (count <= 9) {
                System.out.println(dan + "X" + count + "=" + dan * count);
                count++;
            }
            dan++;
            System.out.println();
        }

    }

}
