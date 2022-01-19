package com.exe.service;

import java.util.List;

import com.exe.entity.Student;

public interface StudentService {

	
public Student addStudent(Student student);

public List<Student> getAllStudents();

public Student getStudentById(int id);

public void deleteStudentById(int id);

//public Student updateStudentById(int id);
}
