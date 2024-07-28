package com.example.part08.controller;

import com.example.part08.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path = "/hello") // http://localhost:8080/api/get/hello
    public String getHello() {
        return "Hello World";
    }

    // @RequestMapping("/hi") --> GET, POST, PUT, DELETE 기능을 모두 동작시킬 수 있다.
    @RequestMapping(path = "/hi", method = RequestMethod.GET) // GET
    public String hi() {
        return "hi";
    }

    // http://localhost:8080/api/get/get-variable/{name}
    // http://localhost:8080/api/get/get-variable/spring-boot
    // http://localhost:8080/api/get/get-variable/9diin
    // name처럼 변화하는 값을 조회하기
    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable String name) {
        System.out.println("Path variable name = " + name);
        return name;
    }
    // 위 코드에서 중요한 점은 @GetMapping 안에 있는 동적 데이터 변수 이름과
    // @PathVariable 변수 이름이 같아야 한다는 것이다.

    @GetMapping("/path-variable2/{id}")
    public String pathVariable2(@PathVariable(name = "id") String pathName, String name) {
        System.out.println("Path variable name = " + name + " path = " + pathName);
        return pathName;
    }

    // ?key1=value1&key2=value2&key3=value3...
    // http://localhost:8080/apit/get/query-param?user=steve&email=steve@gmail.com&age=30
    @GetMapping(path = "/query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam) {
        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");

            sb.append(entry.getKey() + "=" + entry.getValue() + "\n");
        });

        return sb.toString();
    }

    @GetMapping("query-param02")
    public String queryParam02(@RequestParam String name, @RequestParam String email, @RequestParam int age) {
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);

        return name + "," + email + "," + age;
    }

    @GetMapping("query-param03")
    public String queryParam03(UserRequest userRequest) {
        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());

        return userRequest.toString();
    }
}
