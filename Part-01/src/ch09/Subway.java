package ch09;

public class Subway {
    int lineNumber; // 지하철 노선
    int passengerCount; // 승객 수
    int income; // 수입

    public Subway(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void take(int money) {
        this.passengerCount++; // 승객 수 증가
        this.income += money; // 버스요금 수입
    }

    public void showSubwayInfo() {
        System.out.println(lineNumber + "호선 지하철의 승객 수는 " + passengerCount + "명 이고, 수입은 " + income + "원 입니다.");
    }
}
