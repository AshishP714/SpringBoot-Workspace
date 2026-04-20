package com.easy.StuController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.easy.Dto.LoginDto;
import com.easy.StuIMPL.AuthService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
	
    @Autowired
    private AuthService authService;
    
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginDto request) {
        return ResponseEntity.ok(authService.login(request));
    }
}