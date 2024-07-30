package org.daffy3.jpa.bookmanager.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void test() {
        User user = new User();
        user.setName("marco");
        user.setEmail("marco@test.com");

        User user2 = User.builder().name("9Diin").email("9diin@test.com").build();

        System.out.println(user);
        System.out.println(user2);
    }
}