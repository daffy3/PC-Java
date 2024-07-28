package com.daffy3.ch11;

public class Intro {
    // 조건문 if문 (만약 ... 라면)
    // - 주어진 조건에 따라 다른 실행이 이루어지도록 구현
    // = 하나의 상황에 대한 조건이 여러 개로 나뉘고 각 조건에 다른 수행이 이루어져야 할 경우 사용
    // - 각 조건은 상호 배타적임

    public static void main(String[] args) {

        int age = 7;

        if (age >= 8) {
            System.out.println("학교에 다닙니다.");
        } else {
            System.out.println("학교에 다니지 않습니다.");
        }

        System.out.println("노는 게 제일 좋아!!");

    }
}
