package com.devpablo.quickstart;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @GetMapping()
    public ResponseEntity<String> helloWorld(){
        return ResponseEntity.ok("Hola mundo devpablo");
    }
}
