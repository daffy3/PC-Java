package com.example.part08.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 해당 Class는 REST API 처리하는 Controller
@RequestMapping("/api") // RequestMapping URI를 지정해주는 애너테이션(Annotation)
public class ApiController {

    @GetMapping("/hello") // http://localhost:8080/api/hello
    public String hello(){
        return "Hello Spring Boot!";
    }

}
