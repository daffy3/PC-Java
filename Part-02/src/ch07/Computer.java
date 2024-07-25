package ch07;

public abstract class Computer {
    // 구현부가 없는 추상 메서드
    // '하위 클래스에게 책임을 위임한다' 라고 한다.
    public abstract void display();

    // 구현부가 없는 추상 메서드
    public abstract void typing();

    public void turnOn() {
        System.out.println("전원을 켜다.");
    }

    public void turnOff() {
        System.out.println("전원을 끄다.");
    }
}
