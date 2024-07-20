package ch06;

public class SubjectTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100,"Lee");
        Student studentKim = new Student(200,"Kim");

        studentLee.setKoreaSubject("국어",100);
        studentLee.setMathSubject("수학",75);
        studentLee.showScore();

        studentKim.setKoreaSubject("국어",60);
        studentKim.setMathSubject("수학",80);
        studentKim.showScore();
    }
}
