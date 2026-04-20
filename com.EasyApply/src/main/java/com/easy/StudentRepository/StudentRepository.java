package com.easy.StudentRepository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.easy.Entity.StuRegister;



@Repository
public interface StudentRepository  extends JpaRepository<StuRegister, Integer>{

	
	  boolean    existsByEmail(String email);
	  Optional<StuRegister> findByEmail(String username);
	  
	  
	
}
