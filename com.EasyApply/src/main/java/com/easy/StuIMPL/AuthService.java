package com.easy.StuIMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.easy.Dto.LoginDto;
import com.easy.StudentRepository.StudentRepository;

@Service
public class AuthService {
	
	
	@Autowired
	public StudentRepository repo; 
	
	
	   @Autowired
	    private AuthenticationManager authenticationManager;
	   
	   public String login(LoginDto dto) {
		   
		   Authentication authentication = authenticationManager.authenticate(
				   
				   new UsernamePasswordAuthenticationToken(
						   dto.getEmail(),
						   dto.getPassword()
	                )
	        );
		   
		   if (authentication.isAuthenticated()) {
	            return "Login Success";
	        } else {
	            return "Login Failed";
	        }
	    }
		   
	   
	
	
	

}
