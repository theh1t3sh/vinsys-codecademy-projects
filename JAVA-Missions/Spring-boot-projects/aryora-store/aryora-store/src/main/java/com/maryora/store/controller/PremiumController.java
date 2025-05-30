package com.aryora.store.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/premium")
public class PremiumController {

    @GetMapping("/benefits")
    public ResponseEntity<String> getPremiumBenefits() {
        return ResponseEntity.ok("Exclusive premium benefits: Discounts, Early access, etc.");
    }
}