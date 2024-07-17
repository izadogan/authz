package com.acme.authz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author isa
 * @since 18.07.2024
 */
@RestController
public class AuthzController {
    @GetMapping("/hello")
    public String hello() {
        return "helloooo";
    }

}
