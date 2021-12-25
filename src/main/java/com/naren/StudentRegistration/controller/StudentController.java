package com.naren.StudentRegistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naren.StudentRegistration.entity.Student;
import com.naren.StudentRegistration.repository.StudentRepository;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentRepository repository;
	
	
	@PostMapping()
	public Student create(@RequestBody Student student) {
		return repository.save(student);
	}
	
	@PostMapping("/list")
	public List<Student> createList(@RequestBody List<Student> students){
		return repository.saveAll(students);
	} 
	
	@GetMapping()
	public List<Student> getAll(){
		return repository.findAll();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
