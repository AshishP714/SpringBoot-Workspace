package com.easy.Dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class StudentDTO {
	
	
	  @NotBlank(message = "Name is required")
    private String name;
	  
	  @Email(message = "Invalid email format")
	    @NotBlank(message = "Email is required")
    private String email;
    

	    @NotBlank(message = "Phone is required")
	    @Size(min = 10, max = 10, message = "Phone must be 10 digits")
    private String phone;
    
	    @NotBlank(message = "Password is required")
	    @Size(min = 6, message = "Password must be at least 6 characters")
    private String password;
    
	    @NotBlank(message = "College is required")
    private String college;
    

    @NotBlank(message = "Degree is required")
    private String degree;
    
    @NotBlank(message = "Year is required")
    private String year;
    
    private String skills;
    
    
    
    

}
