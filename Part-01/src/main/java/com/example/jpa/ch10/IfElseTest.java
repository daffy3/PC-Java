package com.example.jpa.ch10;

public class IfElseTest {
    // if-else if문과 if-if문의 차이점
    // if-else if를 사용하는 경우 하나의 조건이 만족되면 나머지 else if 부분은 수행되지 않는다.
    // if-if로 사용하게 되면 각각 다른 조건 문으로 해석되어 각각 수행하게 된다.

    public static void main(String[] args) {
        int age = 12;
        int charge = 0;

        if (age < 8) {
            charge = 1000;
            System.out.println("미취학 아동입니다.");
        } else if (age < 14) {
            charge = 2000;
            System.out.println("초등학생입니다.");
        } else if (age < 20) {
            charge = 2500;
            System.out.println("중, 고등학생입니다.");
        } else {
            charge = 3500;
            System.out.println("일반인입니다.");
        }
        System.out.println("입장료는 " + charge + "원 입니다.");
    }
}
