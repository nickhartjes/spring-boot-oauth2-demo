package com.example.demo;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class TestController {

    @GetMapping("/public")
    String open() {
        return "Hallo open";
    }

    @GetMapping("/api/me")
    String api(Principal principal) {
        return String.format("Hallo, %s", principal.getName());
    }

    @GetMapping("/api/admin")
    String admin(Principal principal) {
        return String.format("Hallo admin, %s", principal.getName());
    }
}
