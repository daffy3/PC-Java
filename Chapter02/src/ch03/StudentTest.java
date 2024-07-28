package ch03;

public class StudentTest {
    public static void main(String[] args) {
        // 클래스를 기반으로 여러개의 인스턴스를 생성할 수 있다.
        Student studentLee = new Student(); // new 키워드를 통해 학생 1명을 생성할 수 있는데, 이렇게 생성되는 객체를 인스턴스라 한다.
        Student studentKim = new Student(); // 참조변수: 생성된 메모리 주소, 위치를 나타낸다.

        studentLee.studentId = 10010;
        studentLee.setStudentName("Lee");
        studentLee.address = "서울특별시 서초구 방배동";
        studentLee.showStudentInfo(); // 10010학번 학생의 이름은 Lee이고, 주소는 서울특별시 서초구 방배동입니다.

        studentKim.studentId = 10020;
        studentKim.studentName = "Kim";
        studentKim.address = "경기도 성남시 분당구 정자동";
        studentKim.showStudentInfo(); // 10020학번 학생의 이름은 Kim이고, 주소는 경기도 성남시 분당구 정자동입니다.

        System.out.println(studentLee); // ch03.Student@5caf905d
        System.out.println(studentKim); // ch03.Student@27716f4
    }
}
