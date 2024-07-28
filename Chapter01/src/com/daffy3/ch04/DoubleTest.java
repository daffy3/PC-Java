package com.daffy3.ch04;

public class DoubleTest {
    public static void main(String[] args) {

        double dNum = 3.14;
        float fNum1 = 3.14; // float에 3.14를 대입하면 오류가 난다. 실수형은 기본적으로 double에 저장이 되기 때문에 이미 8바이트로 잡혀있는 값을 복사해서 넣은 것이기 때문에
        // double을 float에 대입할 수 없기 때문에 대입할 값 뒤에 f or F를 붙여 할당한다.
        float fNum2 = 3.14F;

        System.out.println(dNum);
        System.out.println(fNum2);

        // 부동소수점 방식의 오류
        // 지수와 가수로 나타내는 부동소수점 방식에서는 지수부가 0을 표현할 수 없기 때문에 약간의 오차가 발생할 수 있다.
    }
}
