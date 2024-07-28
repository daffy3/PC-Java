package com.daffy3.ch06;

public class Intro {
    // 09. 자료형(data-type) - 논리형과 자료형 없이 변수 사용하기

    // 논리형
    // - true(참) / false(거짓) 두 가지만 표현할 수 있다.
    // - 1바이트를 사용
    // - 값이 존재하는지, 배열이 비었는지, 결과가 참인지 거짓인지를 판별한다.

    public static void main(String[] args) {

        boolean isMarried = true;
        System.out.println(isMarried);
    }

    // 지역변수 자료형 없이 사용하기 (자바 10부터 지원)
    // - Local Variable Type Inference
    // - 추론 가능한 변수에 대한 자료형을 선언하지 않음
    // - 한 번 선언하여 추론된 변수는 다른 타입의 값을 대입할 수 없음
    // - 지역변수만 사용 가능
}
