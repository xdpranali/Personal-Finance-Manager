package com.example.PersonalFinanceManager.controller;


import com.example.PersonalFinanceManager.model.User;
import com.example.PersonalFinanceManager.service.UserService;
import com.example.PersonalFinanceManager.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.save(user);
    }

    @PostMapping("/authenticate")
    public String authenticate(@RequestBody User user) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword())
            );
        } catch (AuthenticationException e) {
            throw new Exception("Invalid username or password", e);
        }

        final UserDetails userDetails = userService.loadUserByUsername(user.getUsername());
        return jwtUtil.generateToken(userDetails);
    }
}
