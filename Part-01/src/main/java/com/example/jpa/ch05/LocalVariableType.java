package com.example.jpa.ch05;

public class LocalVariableType {
    // 자료형(Data Type) - 논리형과 자료형 없이 변수 사용하기
    // 논리형
    // - true(참),false(거짓) 두 가지만 나타낸다.
    // - 1바이트를 사용한다.
    // - 값이 존재하는지, 배열이 비었는지, 결과가 참인지 거짓인지 등을 표현

    // ====================================================================================================

    // 지역 변수 자료형 없이 사용하기
    // - Local Variable Type Inference
    // - 추론 가능한 변수에 대한 자료형을 선언하지 않음
    // - 한 번 선언하여 추론된 변수는 다른 타입의 값을 대입할 수 없음
    // - 지역변수만 사용가능

    public static void main(String[] args) {
        var i = 10; // int
        var j = 10.0; // double
        var str = "Hello World"; // String

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        str = "test";
        // str = 3; -> 타입오류: 이미 String으로 사용되었기에 number 타입으로 바꿀 순 없다.
    }
}
