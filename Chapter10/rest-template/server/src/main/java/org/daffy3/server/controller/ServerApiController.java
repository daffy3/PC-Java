package org.daffy3.server.controller;

import org.daffy3.server.dto.Req;
import org.daffy3.server.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

@RestController
@RequestMapping("/api/server")
public class ServerApiController {

    private static final Logger log = LoggerFactory.getLogger(ServerApiController.class);


    @GetMapping("/naver")
    public String naver() {
        String query = "용인";

        URI uri = UriComponentsBuilder
                .fromUriString("https://openapi.naver.com")
                .path("/v1/search/local")
                .queryParam("query", query)
                .queryParam("display", 100)
                .queryParam("start", 1)
                .queryParam("sort", "random")
                .encode(StandardCharsets.UTF_8).build().toUri();

        RestTemplate restTemplate = new RestTemplate();
        RequestEntity<Void> req = RequestEntity.get(uri).header("X-Naver-Client-Id", "wKIApr24VMOaY1aSpzkc").header("X-Naver-Client-Secret", "4kN7PvIu9R").build();
        ResponseEntity<String> response = restTemplate.exchange(req, String.class);

        return response.getBody();
    }


    @GetMapping("/hello")
    public User hello(@RequestParam String name, @RequestParam int age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);

        return user;
    }

    @PostMapping("/user/{userId}/name/{userName}")
    public Req<User> post(
            @RequestBody Req<User> user,
            @PathVariable int userId,
            @PathVariable String userName,
            @RequestHeader("x-authorization") String authorization,
            @RequestHeader("custom-header") String customHeader) {
        log.info("userId: {}, userName: {}", userId, userName);
        log.info("authorization: {}, customHeader: {}", authorization, customHeader);
        log.info("client req: {}", user);

        Req<User> response = new Req<>();
        response.setHeader(new Req.Header());
        response.setBody(user.getBody());

        return response;
    }
}
