package com.example.jpa.part10.controller;

import com.example.jpa.part10.dto.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/student")
public class RestApiController {

    @GetMapping("")
    // required = false 옵션은 RequestParam가 없어도 동작을 하되, name은 NULL이다.
    public Student get(@RequestParam(required = false) String name, @RequestParam(required = false) Integer age) {
        Student student = new Student();
        student.setName(name);
        student.setAge(age);

        return student;
    }

    @PostMapping("")
    public Student post(@RequestBody Student student) {
        System.out.println(student);
        return student;
    }
    
}
