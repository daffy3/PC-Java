package com.example.jpa.ch06;

public class TypeConversionTest {
    // 형 변환(Type Conversion)
    // - 서로 다른 자료형 간에 연산 등의 수행을 위해 하나의 자료형으로 통일하는 것
    // - 묵시적 형 변환(자동 형 변환)과 명시적 형 변환(강제 형 변환)이 있다.
    // - 바이트 크기가 작은 자료형에서 큰 자료형으로 형 변환은 자동으로 이루어진다.
    // - 덜 정밀한 자료형에서 더 정밀한 자료형으로의 형 변환은 자동으로 이루어진다.

    public static void main(String[] args) {
        int iNum = 225;
        byte bNum = (byte) iNum;

        System.out.println(bNum);

        // ====================================================================================================

        double dNum = 1.2;
        float fNum = 0.9F;

        int iNuM2 = (int) dNum + (int) fNum; // 1 + 0
        int iNum3 = (int) (dNum + fNum); // 2
        System.out.println(iNuM2); // 1
        System.out.println(iNum3); // 2
    }
}
