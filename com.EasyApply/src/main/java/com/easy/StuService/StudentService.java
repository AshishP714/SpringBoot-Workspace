package com.easy.StuService;

import org.springframework.stereotype.Service;

import com.easy.Dto.StudentDTO;



@Service
public interface StudentService {
	
	String register(StudentDTO student);

}
