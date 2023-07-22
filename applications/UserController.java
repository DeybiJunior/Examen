package com.example.applications;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public User registerUser(@RequestBody RegistrationRequest registrationRequest) {
        return userService.registerUser(registrationRequest.getUsername(), registrationRequest.getPassword());
    }
}

class RegistrationRequest {
    private String username;
    private String password;

}
