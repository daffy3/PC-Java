package com.example.jpa.part10.controller;

import com.example.jpa.part10.dto.User;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @PostMapping("/user")
    // DTO 내에서 Validation 체크를 하기 위해서 @Valid 키워드를 넣는다.
    public ResponseEntity user(@Valid @RequestBody User user, BindingResult bindingResult) {
        // @Valid의 Validation 결과가 bindingResult에 값이 담기게 된다.
        if (bindingResult.hasErrors()) {
            StringBuilder sb = new StringBuilder();
            bindingResult.getAllErrors().forEach(error -> {
                FieldError field = (FieldError) error;
                String message = field.getDefaultMessage();

                System.out.println("field: " + field.getField() + ", message: " + message);

                sb.append("field: " + field.getField() + ", message: " + message);
            });

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(sb.toString());
        }

        System.out.println(user);
        if (user.getAge() >= 90) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(user);
        }

        return ResponseEntity.ok(user);
    }

}
