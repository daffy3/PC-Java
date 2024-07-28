package ch03;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10010,"이순신");
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo()); // 이순신님의 등급은 SILVER이며, 보너스 포인트는 1000점 입니다.

        VIPCustomer customerKim = new VIPCustomer(10020,"김유신");
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo()); // 김유신님의 등급은 VIP이며, 보너스 포인트는 10000점 입니다.
        // 위 코드에서 Customer 디폴트 커스터머에서 로그를 찍고, VIPCustomer 커스터머에서 로그를 찍으면
        // Customer 커스터머의 로그가 먼저 찍히고, 다음으로 VIPCustomer 커스터머 내에 선언한 로그가 찍히는데
        // 그 이유는 VIPCustomer가 Customer를 상속하고 있기 때문이다.

        Customer vc = new VIPCustomer(21345,"no-name");
        // 위 vc가 VIPCustomer의 인스턴스 상태라고 해도, Customer로 타입이 형변환이 되었기 때문에 Customer의 멤버변수 등만 사용할 수 있다.
        // - Customer vc = new VIPCustomer(); 에서 vc가 가리키는 것은?
        // - VIPCustomer() 생성자에 의해 VIPCustomer 클래스의 모든 멤버 변수에 대한 메모리는 생성되었지만,
        //   변수의 타입이 Customer 이므로 실제 접근 가능한 변수나 메서드는 Customer의 변수와 메서드이다.

    }
}
