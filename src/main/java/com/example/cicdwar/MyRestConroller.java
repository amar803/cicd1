package com.example.cicdwar;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestConroller {
    @GetMapping("/hello")
    public ResponseEntity<String> helloController(){

        return ResponseEntity.ok("CICD Project 1");

    }
}
