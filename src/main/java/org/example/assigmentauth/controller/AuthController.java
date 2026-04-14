package org.example.assigmentauth.controller;
import org.example.assigmentauth.dto.LoginRequest;
import org.example.assigmentauth.dto.LoginResponse;
import org.example.assigmentauth.dto.RegisterRequest;
import org.example.assigmentauth.dto.ResetPasswordRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class AuthController {

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
        if ("admin".equals(request.getUsername()) && "1234".equals(request.getPassword())) {
            return ResponseEntity.ok(new LoginResponse("login successful!", "demo-token-123"));
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                .body(new LoginResponse("invalid username or password", null));
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegisterRequest request) {
        return ResponseEntity.ok().body(new LoginResponse("registration successful!", null));
    }

    @PostMapping("/reset-password")
    public ResponseEntity<?> resetPassword(@RequestBody ResetPasswordRequest request) {
        return ResponseEntity.ok().body(new LoginResponse("password reset successful!", null));
    }
}