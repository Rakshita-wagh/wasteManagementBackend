package com.wasteProj.wasteManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/login")
public class loginController {

    @Autowired
    private signupRepo signupRepository;

    @PostMapping
    public ResponseEntity<?> login(@RequestBody signupModel loginRequest) {
        String name = loginRequest.getname();
        String password = loginRequest.getPassword();

        // Find user in the database by name
        signupModel user = signupRepository.findByname(name);

        if (user != null && user.getPassword().equals(password)) {
            // If user is found and password matches, return success
            return ResponseEntity.ok("Login successful!");
        } else {
            // If user is not found or password doesn't match, return error
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
        }
    }
}
