package com.example.demo.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.StudentModel;
import com.example.demo.Repository.StudentRepository;
@Service
public class StudentService {
	@Autowired
	StudentRepository stRepo;
	public StudentModel saveDetails(StudentModel e)
	{
		return stRepo.save(e);
	}
	public List<StudentModel> getDetails()
	{
		return stRepo.findAll();
	}
	
	
	
}