package com.exe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.employee.customexception.BusinessException;
//import com.employee.customexception.ControllerException;
import com.exe.entity.Student;
import com.exe.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/save")
	public ResponseEntity<Student> addStudent(@RequestBody Student student){
		
		return new ResponseEntity<Student>(studentService.addStudent(student), HttpStatus.CREATED);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Student>> getAllStudents(){
		
		return new ResponseEntity<List<Student>>(studentService.getAllStudents(),HttpStatus.OK);
	}
	
	@GetMapping("/getId/{id}")
	public ResponseEntity<Student> getStuById(@PathVariable int id){
		return new ResponseEntity<Student>(studentService.getStudentById(id), HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteStudent(@PathVariable ( "id") int std){
		studentService.deleteStudentById(std);
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/update")
public ResponseEntity<Student> updateStudent(@RequestBody Student student){
		
		return new ResponseEntity<Student>(studentService.addStudent(student), HttpStatus.CREATED);
	}

	
}
