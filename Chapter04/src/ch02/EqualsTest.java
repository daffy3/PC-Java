package ch02;

public class EqualsTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        Student student01 = new Student(100, "Lee");
        Student student02 = new Student(100, "Lee");

        System.out.println(student01 == student02); // false --> 다른 객체이므로 false
        System.out.println(student01.equals(student02)); // false --> 두 객체의 주소값이 같은지 다른지 체크

        // 그러나 논리적으로 같은 데이터이기 때문에 같은 학생으로 처리한다.
        // Student 클래스에서 equals 메서드를 재정의해준다.

        // ====================================================================================================

        System.out.println(student01.hashCode()); // 990368553
        System.out.println(student02.hashCode()); // 1096979270

        // Student 클래스에서 hashCode 메서드를 재정의해준다.
        // 그러나 본래 가지고 있던 hashCode 값은 어떻게 알 수 있을까?
        System.out.println(System.identityHashCode(student01)); // 990368553
        System.out.println(System.identityHashCode(student02)); // 1096979270

        // ====================================================================================================

        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1.hashCode()); // 96354
        System.out.println(str2.hashCode()); // 96354

        // ====================================================================================================

        Student copyStudent = (Student) student01.clone();
        System.out.println(copyStudent);
    }
}
