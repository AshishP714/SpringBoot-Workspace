	package com.easy.Security;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.easy.Entity.StuRegister;
import com.easy.StudentRepository.StudentRepository;


@Service
public class CutomerDetailsService implements UserDetailsService {

	
	
	@Autowired
	public StudentRepository repo; 
	
	@Override
	public UserDetails loadUserByUsername(String email )throws UsernameNotFoundException {
		StuRegister stu = repo.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("user not found"));
		
		 return new org.springframework.security.core.userdetails.User(
				 stu.getEmail(),
				 stu.getPassword(),
	                new ArrayList<>());
	}

}
