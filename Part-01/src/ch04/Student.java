package ch04;

public class Student {
    public int studentNumber;
    public String studentName;
    public int grade;

    public Student() {
    }

    public Student(int studentNumber, String studentName, int grade) {
        System.out.println("Student 생성");

        // 멤버변수에게 할당 = 초기화
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.grade = grade;
    }

    public String showStudentInfo() {
        return studentName + " 학생의 학번은 " + studentNumber + "이고, " + grade + "학년 입니다.";
    }
}
