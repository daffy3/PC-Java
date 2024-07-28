package com.example.part08.controller;

import com.example.part08.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // 페이지를 리턴하는 서버를 작성하는 컨트롤러
public class PageController {

    @RequestMapping("/main")
    public String main() {
        return "main.html";
    }

    // ResponseEntity
    @ResponseBody
    @GetMapping("/user")
    public UserDto user() {
        var user = new UserDto();
        user.setUsername("marco");
        user.setAddress("서울특별시 강남구");

        return user;
    }
}
