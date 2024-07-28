package ch08;

public abstract class Car {
    public abstract void drive();

    public abstract void stop();

    public void startEngine() {
        System.out.println("시동을 걸다.");
    }

    public void turnOffEngine() {
        System.out.println("시동을 끄다.");
    }

    // 아래 시나리오는 변하면 안된다. --> 템플릿 메서드 패턴
    // 하위 클래스에서 재정의를 못한다. --> final 선언
    final public void run() {
        startEngine();
        drive();
        stop();
        turnOffEngine();
    }
}
