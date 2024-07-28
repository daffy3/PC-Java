package ch07;

public class Intro {
    // 10. 접근제어지시자(access modifier)와 정보은닉(information hiding)
    // 접근제어지시자(access modifier)
    // - 클래스 외부에서 클래스의 멤버변수, 메서드, 생성자를 사용할 수 있는지 여부를 지정하는 키워드
    // - private: 같은 클래스 내부에서만 접근 가능(외부 클래스, 상속관계의 클래스에서도 접근 불가)
    // - 아무것도 없음(default): 같은 패키지 내부에서만 접근 가능(상속관계라도 패키지가 다르면 접근불가)
    // - protected: 같은 패키지나 상속관계의 클래스에서 접근 가능하고 그 외 외부에서는 접근할 수 없다.
    // - public: 클래스의 외부 어디서나 접근할 수 있다.

    // get() / set()
    // - private으로 선언된 멤버변수(필드)에 접근, 수정할 수 있는 메서드를 public으로 제공
    // - get() 메서드만 제공되는 경우 read-only 필드
}
