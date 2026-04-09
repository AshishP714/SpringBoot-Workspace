package com.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Entity.User;
import com.demo.Repository.UserRepo;

@RestController
@RequestMapping("/user")
public class UserRestController {
	
	@Autowired
	BCryptPasswordEncoder encoder;
	
	@Autowired
	UserRepo ur;
		
	@PostMapping("/create-user")
	public ResponseEntity<User> createusers(@RequestBody User user) {
		user.setPassword(encoder.encode(user.getPassword()));
		user.setRole("USER");
		
		User save = ur.save(user);
		
		return new ResponseEntity<User>(save , HttpStatus.CREATED);	
	}
	
	@GetMapping("/welcome")
	public String msg () {
		return "hii";
	}
}