package org.daffy3.client.service;

import org.daffy3.client.dto.Req;
import org.daffy3.client.dto.UserRequest;
import org.daffy3.client.dto.UserResponse;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Service
public class RestTemplateService {
    // http://localhost/api/server/hello
    // response
    public UserResponse hello() {
        URI uri = UriComponentsBuilder.fromUriString("http://localhost:9090").path("/api/server/hello").queryParam("name", "daffy3").queryParam("age", 32).encode().build().toUri();

        System.out.println(uri.toString());

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<UserResponse> result = restTemplate.getForEntity(uri, UserResponse.class);

        System.out.println(result.getStatusCode());
        System.out.println(result.getBody());

        return result.getBody();
    }

    public UserResponse post() {
        // http://localhost:9090/api/server/user/{userId}/name/{userName}
        URI uri = UriComponentsBuilder.fromUriString("http://localhost:9090").path("/api/server/user/{userId}/name/{userName}").encode().build().expand(100, "daffy3").toUri();

        System.out.println(uri);

        // post이기 때문에 request body가 있어야 한다.
        // http body -> object -> object mapper -> json -> rest template -> http body json
        UserRequest userRequest = new UserRequest();
        userRequest.setName("daffy4");
        userRequest.setAge(30);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<UserResponse> response = restTemplate.postForEntity(uri, userRequest, UserResponse.class);

        System.out.println(response.getStatusCode());
        System.out.println(response.getHeaders());
        System.out.println(response.getBody());

        return response.getBody();
    }

    public UserResponse exchange() {
        // http://localhost:9090/api/server/user/{userId}/name/{userName}
        URI uri = UriComponentsBuilder.fromUriString("http://localhost:9090").path("/api/server/user/{userId}/name/{userName}").encode().build().expand(100, "daffy3").toUri();

        System.out.println(uri);

        // post이기 때문에 request body가 있어야 한다.
        // http body -> object -> object mapper -> json -> rest template -> http body json
        UserRequest userRequest = new UserRequest();
        userRequest.setName("daffy4");
        userRequest.setAge(30);

        RequestEntity<UserRequest> requestEntity = RequestEntity.post(uri).contentType(MediaType.APPLICATION_JSON).header("x-authorization", "daffy3").header("custom-header", "ABCD").body(userRequest);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<UserResponse> response = restTemplate.exchange(requestEntity, UserResponse.class);
        return response.getBody();
    }

    public Req<UserResponse> genericExchange() {
        // http://localhost:9090/api/server/user/{userId}/name/{userName}
        URI uri = UriComponentsBuilder.fromUriString("http://localhost:9090").path("/api/server/user/{userId}/name/{userName}").encode().build().expand(100, "daffy3").toUri();
        System.out.println(uri);

        // post이기 때문에 request body가 있어야 한다.
        // http body -> object -> object mapper -> json -> rest template -> http body json

        UserRequest userRequest = new UserRequest();
        userRequest.setName("daffy4");
        userRequest.setAge(30);

        Req<UserRequest> req = new Req<>();
        req.setHeader(new Req.Header());
        req.setBody(userRequest);


        RequestEntity<Req<UserRequest>> requestEntity = RequestEntity
                .post(uri)
                .contentType(MediaType.APPLICATION_JSON)
                .header("x-authorization", "daffy3")
                .header("custom-header", "ABCD")
                .body(req);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Req<UserResponse>> response = restTemplate.exchange(requestEntity, new ParameterizedTypeReference<Req<UserResponse>>() {
        });

        return response.getBody();
    }
}
