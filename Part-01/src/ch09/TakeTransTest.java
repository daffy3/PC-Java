package ch09;

public class TakeTransTest {
    public static void main(String[] args) {
        Student studentJ = new Student("James", 5000);
        Student studentT = new Student("Tomas", 10000);

        Bus bus100 = new Bus(100);
        Bus bus500 = new Bus(500);

        Subway greenSubway = new Subway(2);

        studentJ.takeBus(bus100);
        studentT.takeSubway(greenSubway);

        studentJ.showStudentInfo();
        studentT.showStudentInfo();

        bus100.showBusInfo();
        bus500.showBusInfo();
        greenSubway.showSubwayInfo();
    }
}
