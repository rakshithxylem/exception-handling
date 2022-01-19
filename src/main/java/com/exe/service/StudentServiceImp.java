package com.exe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.exe.entity.Student;
import com.exe.handler.ServiceException;
import com.exe.repository.StudentReposiory;

@Service
public class StudentServiceImp implements StudentService {

	@Autowired
	private StudentReposiory studentReposiory;

	@Override
	public Student addStudent(Student student) {
		
		if(student.getName()==null || student.getName().length()==0) {
		throw new ServiceException("101", "null is not accepted");
		}
		
		
		try {
			Student student1= studentReposiory.save(student);
return student1;
		}catch (Exception e) {
		throw new ServiceException("601", " save error");
		}
		
		 	}

	@Override
	public List<Student> getAllStudents() {
	
		return studentReposiory.findAll();
	}

	@Override
	public Student getStudentById(int id) {
	
		return studentReposiory.findById(id).get();
	}

	@Override
	public void deleteStudentById(int id) {
	 studentReposiory.deleteById(id);
		
	}

	
	
}
