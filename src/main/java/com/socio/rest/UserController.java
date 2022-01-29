package com.socio.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @GetMapping
    public ResponseEntity<String> getUsersStatistics() {
        return ResponseEntity.ok("User statistics");
    }

    @PostMapping
    public ResponseEntity<String> createUserStatistics() {
        return ResponseEntity.ok("User statistics created");
    }
}