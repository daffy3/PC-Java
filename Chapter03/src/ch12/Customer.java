package ch12;

// 15. 여러 인터페이스 구현하기, 인터페이스 상속
// 여러 인터페이스 구현
// - 자바의 인터페이스는 구현 코드가 없으므로 하나의 클래스가 여러 인터페이스는 구현할 수 있음
// - 디폴트 메서드가 중복되는 경우는 구현하는 클래스에서 재정의 해야한다.
// - 여러 인터페이스를 구현한 클래스는 인터페이스 타입으로 형 변환 되는 경우 해당 인터페이스에 선언된 메서드만 사용 가능하다.

public class Customer implements Buy, Sell {
    @Override
    public void buy() {
        System.out.println("Customer buys");
    }

    @Override
    public void order() {
        // Buy.super.order();
        // 위 코드처럼 둘 중에 하나 선택해서 재정의 해도 되고
        System.out.println("Customer order");
    }

    @Override
    public void sell() {
        System.out.println("Customer sell");
    }

    public void hello() {
        System.out.println("hello!");
    }
}
