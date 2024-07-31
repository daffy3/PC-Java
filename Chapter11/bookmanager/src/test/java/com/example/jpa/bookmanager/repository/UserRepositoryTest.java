package com.example.jpa.bookmanager.repository;

import com.example.jpa.bookmanager.domain.User;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    // h2 db 주입 이슈 해결 링크
    // https://velog.io/@readnthink/DataJpaTest%EC%82%AC%EC%9A%A9%EC%8B%9C-user-table-%EC%98%88%EC%95%BD%EC%96%B4-%EC%97%90%EB%9F%AC
    @Test
    void crud() {
        userRepository.save(new User("new martin", "newmartin@gmail.com"));
        userRepository.findAll().forEach(System.out::println);
    }

}