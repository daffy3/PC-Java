package com.example.jpa.bookmanager.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Builder
@Entity
public class User {
    // 각각의 필드에서 @Getter / @Setter를 선언해서 활용할 수도 있다.
    // 클래스 스콥에 @Getter / @Setter를 선언하면 전 필드에 적용시킬 수 있다.
    // @ToString은 toString() 메서드를 자동으로 오버라이딩해서 생성해주는 Lombok의 애너테이션이다.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NonNull
    private String name;
    @NonNull
    private String email;
    // createdAt과 updatedAt 생성된 시간과 수정된 시간은 JPA 도메인 객체에는 항상 포함되게 되어 있다.
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // 생성자 관련 애너테이션 3가지
    // - NoArgsConstructor: 아무런 인수/인자를 주지 않고, 생성하는 생성자. --> 디폴트 생성자: JPA에서는 인자/인수가 없는 생성자가 반드시 필요하다.
    // - AllArgsConstructor: 객체가 가지고 있는, 객체에 선언한 필드의 모든 값들을 가지고 생성한 생성자
    // - RequiredArgsConstructor: 꼭 필요한 인자/인수만을 활용해서 생성자를 만들어주는 애너테이션
    //   RequiredArgsConstructor를 사용하게 되면 NoArgsConstructor와 동일하게 동작하게 된다.
    //   NonNull 애너테이션을 사용하게 되면 name, email 값는 필수 값이라고 인식한다.

    // @Data 애너테이션은 @Getter / @Setter / @ToString을 포함한다고만 일단은 이해하자.
    // @Builder 애너테이션 AllArgsConstructor와 비슷하게 객체를 생성하고 필드 값을 주입해주는데 build의 형식을 가지고 제공해준다.
    // @Entity: 자바 객체라는 것을 Entity --> Primary Keu, PK가 반드시 필요하다.
    //          GeneratedValue는 값을 순차적으로 증가시켜주도록 한다.

    // 해당 객체는 어떻게 저장하고, 어떻게 조회할 수 있을까? --> Repository를 생성해서 해결한다.
}
