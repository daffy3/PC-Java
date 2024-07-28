package ch02;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer();
        customerLee.setCustomerName("이순신");
        customerLee.setCustomerId(10010);
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo()); // 이순신님의 등급은 SILVER이며, 보너스 포인트는 1000점 입니다.

        VIPCustomer customerKim = new VIPCustomer();
        customerKim.setCustomerName("김유신");
        customerKim.setCustomerId(10020);
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo()); // 김유신님의 등급은 VIP이며, 보너스 포인트는 10000점 입니다.
    }
}
