package com.example.jpa.bookmanager.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void test() {
        User user = new User();
        user.setName("daffy3");
        user.setEmail("daffy3@gmail.com");
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());

        System.out.println(user); // com.example.jpa.bookmanager.domain.User@895e367 --> 해당 객체의 내용을 할 수 없기 때문에 toString() 메서드를 활용한다.
        System.out.println(">>> " + user); // >>> User(name=daffy3, email=daffy3@gmail.com, createdAt=null, updatedAt=null)

        User user1 = new User(1, "daffy3", "daffy3@gmail.com", LocalDateTime.now(), LocalDateTime.now());
        User user2 = new User("marco", "marco@gmail.com");
        User user3 = User.builder().name("edward").email("edward@gmail.com").build();

        System.out.println(user3); // User(name=edward, email=edward@gmail.com, createdAt=null, updatedAt=null)

    }
}