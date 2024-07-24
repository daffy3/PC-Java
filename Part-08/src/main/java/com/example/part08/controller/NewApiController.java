package com.example.part08.controller;

import com.example.part08.dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class NewApiController {

    @GetMapping("/text")
    public String text(@RequestParam String account) {
        return account;
    }

    // JSON
    // 실제 request 요청이 오면 object mapper를 통해 object로 바뀐다.
    // 그리고나서 현재 메서드를 동작시키고, response로 object를 전달한다.
    // 이때, 응답받은 object가 object mapper를 통해 json으로 변형하여 response로 내려준다.

    // req --> object mapper --> object --> method --> object --> object mapper --> json --> response
    @PostMapping("/json")
    public UserDto json(@RequestBody UserDto user) {
        return user; // 200 OK
    }

    // 우리가 response를 내려줄 때, http status를 정해줄 수 있는데, 이때 @ResponseEntity를 사용한다.
    @PutMapping("/put")
    public ResponseEntity<UserDto> put(@RequestBody UserDto user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

}
