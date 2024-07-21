package ch09;

public class Student {
    String studentName;
    int money;

    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    public void takeBus(Bus bus) {
        // 학생이 어떤 버스를 탔는지를 인수로 받는다.
        bus.take(1000); // 버스요금 지불
        this.money -= 1000;
    }

    public void takeSubway(Subway subway) {
        // 학생이 어떤 지하철을 탔는지를 인수로 받는다.
        subway.take(1200); // 지하철 요금 지불
        this.money -= 1200;
    }

    public void showStudentInfo() {
        System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다.");
    }
}
