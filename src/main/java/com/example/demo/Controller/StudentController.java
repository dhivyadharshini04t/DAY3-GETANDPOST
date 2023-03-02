package com.example.demo.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.StudentModel;
import com.example.demo.Service.StudentService;

@RestController

public class StudentController {
	@Autowired
	StudentService stuService;
	@PostMapping("/addDetails")
	public StudentModel addInfo(@RequestBody StudentModel st)
	{
		return stuService.saveDetails(st);
	}
	
@GetMapping("showDetails")
	public List<StudentModel> fetchDetails()
	{
		return stuService.getDetails();
	}
    
	
}