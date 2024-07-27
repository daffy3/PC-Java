package org.daffy3.filter.controller;

import lombok.extern.slf4j.Slf4j;
import org.daffy3.filter.dto.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/user")
public class ApiController {

    // 기본적으로 Spring Boot에서 로깅을 남길 때는 로깅백을 사용한다.
    @PostMapping("")
    public User user(@RequestBody User user) {
        log.info("User: {}", user);
        return user;
    }

}
