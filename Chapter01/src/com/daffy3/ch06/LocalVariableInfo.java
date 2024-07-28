package com.daffy3.ch06;

public class LocalVariableInfo {
    public static void main(String[] args) {

        var i = 10; // Type is int 으로 추론이 된다.
        var j = 10.0; // Type is double 으로 추론이 된다.
        var str = "test"; // Tyes is String 으로 추론이 된다.

        System.out.println(i); // 10
        System.out.println(j); // 10.0
        System.out.println(str); // test

    }
}
