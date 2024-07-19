package com.example.jpa.ch01;

public class BinaryTest {
    public static void main(String[] args) {
        int num = 10; // 10진수
        int bNum = 0B1010; // 2진수로 10을 표현
        int oNum = 012; // 8진수로 10을 표현
        int xNum = 0XA; // 16진수로 10을 표현

        System.out.println(num); // 10
        System.out.println(bNum); // 10
        System.out.println(oNum); // 10
        System.out.println(xNum); // 10
    }
}
