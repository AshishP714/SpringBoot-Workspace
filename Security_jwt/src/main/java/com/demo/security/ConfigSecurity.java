package com.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.demo.Service.CustomUserDetailsService;
import com.demo.Service.JWTFilter;

@Configuration
@EnableWebSecurity
public class ConfigSecurity {

	@Autowired

	CustomUserDetailsService cs;

	@Autowired
	JWTFilter jwtFilter;

	@Bean
	public BCryptPasswordEncoder encoder() {

		return new BCryptPasswordEncoder();
	}

	@Bean

	public SecurityFilterChain filterchain(HttpSecurity http) {

		http.csrf(t -> t.disable())

				.authorizeHttpRequests(auth -> auth.requestMatchers("/user/create-user", "/authenticate", "/welcome").

						permitAll().anyRequest().authenticated())
				.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class)
				.httpBasic(Customizer.withDefaults()); // for the postman

		return http.build();
	}

	@Bean
	public DaoAuthenticationProvider Daoprovider() {
		DaoAuthenticationProvider p = new DaoAuthenticationProvider(cs);
		p.setPasswordEncoder(encoder());
		return p;
	}

	@Bean
	public AuthenticationManager authManager(AuthenticationConfiguration auth) {
		return auth.getAuthenticationManager();
	}
}