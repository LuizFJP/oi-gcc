package com.curso.gccproject;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Servidor {

    @GetMapping("/")
    public ResponseEntity<?> oi() {
        return ResponseEntity.ok("oi eai");
    }
}
