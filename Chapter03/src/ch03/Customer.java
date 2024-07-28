package ch03;

/**
 * 고객의 속성: 고객 아이디, 고객 이름, 고객 등급, 보너스 포인트, 보너스 포인트 적립비율
 * 일반 고객의 경우, 물품 구매시 1%의 보너스 포인트 적립
 */

public class Customer {
    // 고객의 아이디는 중요한 정보니까 private으로 선언
    // 클래스 상속을 위해 private -> protected 접근 지시자로 변경
    // - 상위 클래스에 선언된 private 멤버변수는 하위 클래스에서 접근할 수 없다.
    // - 외부 클래스는 접근할 수 없지만, 하위 클래스는 접근할 수 있도록 protected 접근 제어자를 사용한다.

    protected int customerId;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    // Default Constructor
//    public Customer() {
//        customerGrade = "SILVER";
//        bonusRatio = 0.01;
//
//        System.out.println("Customer 클래스 호출");
//    }

    public Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;

        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    public int calcPrice(int price) {
        bonusPoint += price + bonusRatio;
        return price;
    }

    public String showCustomerInfo() {
        return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "점 입니다.";
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }
}
