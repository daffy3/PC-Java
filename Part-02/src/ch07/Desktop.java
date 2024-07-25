package ch07;

public class Desktop extends Computer{
    @Override
    public void display() {
        System.out.println("Display: Desktop");
    }

    @Override
    public void typing() {
        System.out.println("Typing: Desktop");
    }

    // 이미 상위클래스에서 선언한 메서드도 재정의 할 수도 있다.
}
