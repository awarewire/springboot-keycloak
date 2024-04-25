package com.awarewire.api.rest.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello-1")
   @PreAuthorize("hasRole('admin_client_role')")
    public String helloAdmin() {
        return "Hola String Boot con KeyCload - Admin";
    }

    @GetMapping("/hello-2")
    @PreAuthorize("hasRole('user_client_role') or hasRole('admin_client_role')")
    public String helloUser() {
        return "Hola String Boot con KeyCload - User";
    }
}
