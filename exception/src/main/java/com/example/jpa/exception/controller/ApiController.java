package com.example.jpa.exception.controller;

import com.example.jpa.exception.dto.User;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@Validated
public class ApiController {

    @GetMapping("")
    // required = false: 필수값이 아니어도 된다.
    // @RequestParam이 없어도 동작이 되도, null로 할당된다.
    public User get(
            @Size(min = 2)
            @RequestParam(required = false) String name,

            @NotNull
            @Min(1)
            @RequestParam(required = false) Integer age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);

        // Q.예외를 한 번 발생시켜보자.
        // int a = 10 + age;
        return user;
    }

    @PostMapping("")
    public User post(@Valid @RequestBody User user) {
        // RequestBody Validation Check를 위해서 @Valid 애너테이션을 붙여준다.
        // 그 후, 값들을 검증해서 오류가 발생하면 에러를 보여준다.
        System.out.println(user);
        return user;
    }

    // 하위 ExceptionHandler는 해당 컨트롤러 안에서만 관여한다.
    // 하위 ExceptionHandler가 GlobalControllerAdvice에 선언되었다고 하더라도
    // 우선순위는 컨트롤러에 지정한 ExceptionHandler가 우선순위로 동작한다. 글로벌어드바이스 핸들러는 동작하지 않는다.
    // @ExceptionHandler(value = MethodArgumentNotValidException.class)
    // public ResponseEntity methodArgumentNotValid(MethodArgumentNotValidException e) {
    //     System.out.println("ApiController");
    //     return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    // }

}
