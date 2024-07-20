package ch02;

public class FunctionTest {
    // 반환 값의 데이터 타입이 int인 경우
    public static int addNum(int num1, int num2) {
        int result;
        result = num1 + num2;

        return result;
    }

    // 반환 값의 데이터 타입이 없는 경우 - void
    public static void sayHello(String greeting) {
        System.out.println(greeting);
    }

    public static int calcSum() {
        int sum = 0;
        int i;

        for (i = 0; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;

        int total = addNum(n1, n2);
        System.out.println(total);

        sayHello("안녕하세요.");

        int num = calcSum();
        System.out.println(num);
    }
}
