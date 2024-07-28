package ch12;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.order();
        customer.hello();

        Buy buyer = customer; // 상위 클래스로 묵시적으로 형 변환, 업캐스팅
        buyer.buy();
        buyer.order();

        Sell seller = customer;
        seller.sell();
        seller.order();
    }
}
