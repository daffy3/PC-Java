package ch03;

public class StringTest2 {
    public static void main(String[] args) {
        String java = new String("java");
        String android = new String("android");

        System.out.println(System.identityHashCode(java)); // 1324119927
        java = java.concat(android);

        System.out.println(java); // javaandroid
        System.out.println(System.identityHashCode(java)); // 990368553

        // 메모리가 새로 생성이 되기 때문에 메모리 낭비가 생길 수 있다.
        // 그래서 StringBuilder와 StringBuffer를 활용한다.
        // String은 final로 선언이 되지만, StringBuilder와 StringBuffer는 가변적이다.

        // - 내부적으로 가변적인 char[]를 멤버 변수로 가짐
        // - 문자열을 여러번 연결하거나 변경할 때 사용하면 유용함
        // - 새로운 인스턴스를 생성하지 않고, char[]을 변경함
        // - StringBuffer는 멀티 쓰레드 프로그래밍에서 동기화를 보장
        // - 단일 쓰레드 프로그램에서는 StringBuilder를 권장
        // - toString() 메서드로 String 반환
    }
}
