package com.example.part08.controller;

import com.example.part08.dto.PutRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutApiController {
//
//    @PutMapping("/put")
//    public void put(@RequestBody PutRequestDto requestDto) {
//        System.out.println(requestDto);
//    }
//
//    @PutMapping("/put/{userId}")
//    public void put2(@RequestBody PutRequestDto requestDto, @PathVariable String userId) {
//        System.out.println(requestDto);
//    }

    @PutMapping("/put/{userId}")
    public void put3(@RequestBody PutRequestDto requestDto, @PathVariable(name = "userId") Long id) {
        System.out.println(id);
    }
}
