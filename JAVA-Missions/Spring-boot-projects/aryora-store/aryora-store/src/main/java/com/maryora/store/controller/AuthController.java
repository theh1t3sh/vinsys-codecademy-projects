package com.aryora.store.controller;

import com.aryora.store.model.User;
import com.aryora.store.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {
    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user) {
        return ResponseEntity.ok(userService.registerUser(user));
    }

    @PostMapping("/upgrade/{userId}")
    public ResponseEntity<User> upgradeToPremium(@PathVariable Long userId) {
        return ResponseEntity.ok(userService.upgradeToPremium(userId));
    }
}