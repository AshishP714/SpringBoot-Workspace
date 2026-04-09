package com.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.demo.Entity.User;
import com.demo.Repository.UserRepo;

@Service
public class CustomUserDetailsService  implements UserDetailsService{
	 
	@Autowired
	UserRepo ur;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<User> findbyUserName = ur.findByUsername(username);
		
		if(findbyUserName.isPresent()) {
			User user= findbyUserName.get();
					
		return org.springframework.security.core.userdetails.User.
				withUsername(user.getUsername()).
				password(user.getPassword())
				.roles(user.getRole()).
				build();			
		}
		throw new UsernameNotFoundException("User Not found " + username	);
	}
}