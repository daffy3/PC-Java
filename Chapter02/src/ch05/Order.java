package ch05;

public class Order {
    String orderNumber; // 주문 번호
    String phoneNumber; // 주문자 휴대폰 번호
    String address; // 주문자 주소
    String orderDate; // 주문 날짜
    String orderTime; // 주문 시간
    String orderPrice; // 주문 가격
    String menuNumber; // 메뉴 번호

    public String showOrderInfo() {
        return "주문 접수 번호 : " + orderNumber + '\n' +
                "주문 핸드폰 번호 : " + phoneNumber + '\n' +
                "주문 집 주소 : " + address + '\n' +
                "주문 날짜 : " + orderDate + '\n' +
                "주문 시간 : " + orderTime + '\n' +
                "주문 가격 : " + orderPrice + '\n' +
                "메뉴 번호 : " + menuNumber + '\n';
    }
}
