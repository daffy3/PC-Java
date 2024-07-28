package com.daffy3.ch03;

public class VariableTest {
    public static void main(String[] args) {

        byte bNum1 = -128; // 바이트는 8비트이기 때문에 -128 ~ 127까지만 표현이 가능하기 때문에 이 값은 오류가 안나지만
        byte bNum2 = 128; // 바이트는 8비트이기 때문에 -128 ~ 127까지만 표현이 가능하기 때문에 이 값은 오류가 난다.

        int num = 12345678900; // int는 4바이트 즉, 32비트이기 때문에 2의 32제곱 갯수만큼 +- 범위 안에서 할당이 가능한데 너무 크기 때문에 int형으로 표현이 불가하다.
        long lNum = 12345678900L; // 그래서 long 타입을 사용할 수 있고, 이때 대입할 수 맨 뒤에 L을 붙여 long 타입임을 명시하자.
    }
}
