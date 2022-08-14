package com.example.randomapi.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
public class HelloWorld {

    @GetMapping("/hello")
    public ResponseEntity<String> helloWorld(){
        log.info("***********************Hit");
        return ResponseEntity.ok("Hello Java WOrld");
    }
}
