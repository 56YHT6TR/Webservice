package com.swarna.webservice;

import java.util.List;

public class StudentService {
private StudentRepository studentRepository;
	
	
	public StudentService(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	public List<Student> getAllUsers()
	{
		return studentRepository.findAll();
	
	}


}
