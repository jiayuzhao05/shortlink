package com.nageoffer.shortlink.admin.controller;

import org.springframework.web.bind.annotation.RestController;
/*
* user control managemnet level
 */
@RestController
public class UserController {
    /**
     *
     * search user info through account name
     */
    @GatMapping("/api/shortlink/v1/user/{username}")
    public String getUserByUsername(@PathVariable("username") String username) {
        return "Hi" + username;
    }
}
