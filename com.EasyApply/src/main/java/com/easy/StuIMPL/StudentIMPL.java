package com.easy.StuIMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.easy.Dto.StudentDTO;
import com.easy.Entity.StuRegister;
import com.easy.StuService.StudentService;
import com.easy.StudentRepository.StudentRepository;


@Service
public class StudentIMPL  implements StudentService{

	@Autowired
	public StudentRepository repo; 
	
	  @Autowired
	    private BCryptPasswordEncoder encoder;
	
	
	@Override
	public String register(StudentDTO dto) {
		
		    if(repo.existsByEmail(dto.getEmail())) {
		   throw new RuntimeException("Email already Exists");
		    }
		    
		   
		    
		    
		    StuRegister user = new StuRegister();
		    
		   
		    
		    user.setName(dto.getName());
	        user.setEmail(dto.getEmail());
	        user.setPhone(dto.getPhone());
	        user.setPassword(encoder.encode(dto.getPassword()));
//	        user.setPassword(dto.getPassword());
	        user.setCollege(dto.getCollege());
	        user.setDegree(dto.getDegree());
	        user.setYear(dto.getYear());
	        user.setSkills(dto.getSkills());
		    
		    
	        	repo.save(user);
		    
		
		return "Student Registered Successfully";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
