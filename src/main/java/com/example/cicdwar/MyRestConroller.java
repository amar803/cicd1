package com.example.cicdwar;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestConroller {
    @GetMapping("/hello")
    public ResponseEntity<String> helloController(){
        String message = "Hello, World!";
        return ResponseEntity.ok(message);
    }
}
