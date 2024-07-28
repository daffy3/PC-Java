package org.daffy3.filter.controller;

import lombok.extern.slf4j.Slf4j;
import org.daffy3.filter.dto.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/temp")
public class ApiUserController {

    @PostMapping("")
    public User user(@RequestBody User user) {
        log.info("User: {}", user);
        return user;
    }

}
