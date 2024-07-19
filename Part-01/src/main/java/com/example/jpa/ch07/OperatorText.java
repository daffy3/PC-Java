package com.example.jpa.ch07;

public class OperatorText {
    public static void main(String[] args) {
        int gameScore = 150;
        int lastScore = ++gameScore;
        System.out.println(gameScore); // 151
        System.out.println(lastScore); // 151

        int gameScore2 = 150;
        int lastScore2 = gameScore2++;
        System.out.println(gameScore2); // 151
        System.out.println(lastScore2); // 150
    }
}
