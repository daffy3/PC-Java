package ch07;

public class BirthdayTest {
    public static void main(String[] args) {
        Birthday date = new Birthday();

        // 멤버변수의 오용 및 오류를 그리고 객체가 잘못사용되는 것을 노출하게 되고 문제를 야기할 수 있기 때문에 private으로 막아주고
        // 메서드에서 set에서 제어해주도록 한다. 따라서 접근제어지시자를 용도에 맞게 적절하게 사용할 수 있도록 한다.
        date.setYear(2024);
        date.setMonth(7);
        date.setDay(21);
        date.showDate();

        // 정보은닉
        // - private으로 제어한 멤버변수도 public 메서드가 제공되면 접근 가능하지만 변수가 public으로 공개되었을 때보다
        //   private일 때, 각 변수에 대한 제한을 public 메서드에서 제어할 수 있다.
        // - 객체지향 프로그램에서 정보 은닉은 필요한 외부에서 접근 가능한 최소한의 정보를 오픈함으로써 객체의 오류를 방지하여
        //   클라이언트 객체가 더 효율적으로 객체를 활용할 수 있도록 해준다.
    }
}
