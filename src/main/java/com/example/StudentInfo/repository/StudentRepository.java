package com.example.StudentInfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StudentInfo.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
