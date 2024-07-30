package org.daffy3.jpa.bookmanager.domain;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @NonNull
    private String name;

    @NonNull
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // 본래 코드 제너레이터로 Getter와 Setter를 활용해 만들었는데
    // Lombok을 활용하여 @Getter / @Setter를 의존성 주입을 통해 더 간편하게 해결할 수 있다.
    // 해당 필드, 각각의 필드에만 @Getter / @Setter를 선언하여 활용할 수도 있다.

    // 아래처럼 toString() 메서드를 오버라이딩하여 사용하면 필드가 추가될 때마다
    // 일일이 하나하나 추가해주어야 하는데 이런 불편함을 해결하기 위해
    // Lombok에서 제공하는 @ToString을 사용하도록 한다.
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }

    // Lombok에서 생성자 관련된 애너테이셔는 3가지가 있다.
    // - NoArgsConstructor --> 필드가 없는 디폴트 생성자를 생성한다는 의미, JPA에서는 NoArgsConstructor가 반드시 필요하다.
    // - AllArgsConstructor --> 객체가 가지고 있는 모든 필드를 기준으로 생성자를 생성한다는 의미
    // - RequiredArgsConstructor --> 꼭 필요한 인자만을 이용하여 생성자를 생성한다는 의미
    //   @NonNull 애너테이션을 통해 필수 값을 표현해준다.

    // @Data 애너테이션을 사용함으로써 여러가지를 한 번에 적용시킬 수가 있는데 잘 사용해야 한다.
    // @Builder는 AllArgsConstructor와 비슷하게 객체를 생성하고 필드 값을 주입해준다.
}
