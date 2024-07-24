package com.example.part08;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Part08ApplicationTests {

    @Test
    void contextLoads() throws JsonProcessingException {
        System.out.println("hello world");

        // Text JSON --> Object
        // Object --> Text JSON

        // controller req json(text) -> object
        // response object -> json(text)

        var objectMapper = new ObjectMapper();

        // object --> text
        // object mapper get method를 활용한다.
        var user = new User("marco", 30,"010-1234-5678");
        var text = objectMapper.writeValueAsString(user);
        System.out.println(text);

        // text --> object
        // object mapper는 동작하기 위해서 디폴트 생성자가 있어야 한다.
        var objectUser = objectMapper.readValue(text, User.class); // 첫 번째는 JSON Text, 두 번째 인수는 어떤 클래스로 변경할 것인지
        System.out.println(objectUser);
    }

}
