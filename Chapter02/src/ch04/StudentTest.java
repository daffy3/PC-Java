package ch04;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student(10010, "Lee", 6);
        Student studentKim = new Student();
        Student studentPark = new Student(10020, "Park", 3);

        // 멤버변수는 자동으로 초기화 되는데 이름 같은 경우는 객체이기 때문에 null, int는 0으로 초기화 된다.
        // 그러나 지역변수 같은 경우에는 초기화 되지 않는다.
        System.out.println(studentKim.showStudentInfo()); // null 학생의 학번은 0이고, 0학년 입니다.
        System.out.println(studentLee.showStudentInfo()); // Lee 학생의 학번은 10010이고, 6학년 입니다.
        System.out.println(studentPark.showStudentInfo()); // Park 학생의 학번은 10020이고, 3학년 입니다.
    }
}
