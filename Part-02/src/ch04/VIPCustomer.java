package ch04;


public class VIPCustomer extends Customer {
    double salesRatio;
    private String agentId;

    public VIPCustomer(int customerId, String customerName) {
        super(customerId, customerName);

        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";
    }

    // overriding되는 함수의 이름은 동일해야 한다.
    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        price -= (int) (price * salesRatio);
        return price;
    }

    public String getAgentId() {
        return agentId;
    }
}
