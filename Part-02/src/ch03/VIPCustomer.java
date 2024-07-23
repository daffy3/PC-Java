package ch03;

/**
 * Customer 클래스에 추가해서 구현하는 것은 좋지 않음
 * VIPCustomer 클래스를 따로 구현
 * 이미 Customer에 구현된 내용이 중복되므로 Customer를 확장하여 구현한다. (상속)
 * <p>
 * 우수고객(VIP Customer) 구현할 때, Customer 클래스에 추가해서 구현하는 것은 좋은 방법은 아니다.
 * 해서, 클래스를 따로 구현했고, Customer 클래스를 상속했다.
 */

public class VIPCustomer extends Customer {
    double salesRatio;
    private String agentId;

//    public VIPCustomer() {
//        super(0, 'no-name');
//
//        bonusRatio = 0.05;
//        salesRatio = 0.1;
//        customerGrade = "VIP";
//
//        System.out.println("VIPCustomer 클래스 호출");
//    }

    public VIPCustomer(int customerId, String customerName) {
        super(customerId, customerName);

        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";

        System.out.println("VIPCustomer 클래스 호출");
    }

    public String getAgentId() {
        return agentId;
    }
}
