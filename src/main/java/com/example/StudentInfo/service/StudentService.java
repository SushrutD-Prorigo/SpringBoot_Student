package com.example.StudentInfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentInfo.entity.Student;
import com.example.StudentInfo.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repository;
	
	public Student addStudent(Student student) {
		return repository.save(student);
	}
	
	public List<Student> addStudents(List<Student> students){
		return repository.saveAll(students);
	}
	
	public List<Student> getStudents(){
		return repository.findAll();
	}
	
	public Student getStudentById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public String deleteStudent(int id) {
		repository.deleteById(id);
		return "DELETED ID"+id;
	}
}
