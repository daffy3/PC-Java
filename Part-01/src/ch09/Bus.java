package ch09;

public class Bus {
    int busNumber; // 버스 번호
    int passengerCount; // 승객 수
    int income; // 수입

    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    public void take(int money) {
        this.passengerCount++; // 승객 수 증가
        this.income += money; // 버스요금 수입
    }

    public void showBusInfo() {
        System.out.println(busNumber + "번 버스의 승객 수는 " + passengerCount + "명 이고, 수입은 " + income + "원 입니다.");
    }
}
