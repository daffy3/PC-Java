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
    // RequestBody Validation Check를 위해서 @Valid 애너테이션을 붙여준다.
    // 그 후, 값들을 검증해서 오류가 발생하면 에러를 보여준다.
    public ResponseEntity user(@Valid @RequestBody User user, BindingResult bindingResult) {
        // BindingResult: 바로 예외를 출력하는 것이 아니라, bindingResult에 Validation 결과가 담긴다.
        if (bindingResult.hasErrors()) {
            StringBuilder sb = new StringBuilder();
            bindingResult.getAllErrors().forEach(error -> {
                FieldError field = (FieldError) error;
                String message = error.getDefaultMessage();

                System.out.println("field: " + field.getField() + " message: " + message);

                sb.append("field: " + field.getField() + " / message: " + message);
            });

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(sb.toString());
        }
        System.out.println(user);

        // ====================================================================================================

        // 실질적으로 동작하는 Logic 작성 부분

        // ====================================================================================================

        return ResponseEntity.ok(user);
    }
}
