package com.example.StudentInfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentInfo.entity.Student;
import com.example.StudentInfo.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student ) {
		return service.addStudent(student);
	}
	
	@PostMapping("/addStudents")
	public List<Student> addStudents(@RequestBody List<Student> students ) {
		return service.addStudents(students);
	}
	
	@GetMapping("/Students")
	public List<Student> findAllProducts(){
		return service.getStudents();
	}
	
	@GetMapping("/StudentById/{id}")
	public Student findStudentById(@PathVariable int id) {
		return service.getStudentById(id);
	}
	
	@DeleteMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable int id) {
		return service.deleteStudent(id);
	}
	

}
