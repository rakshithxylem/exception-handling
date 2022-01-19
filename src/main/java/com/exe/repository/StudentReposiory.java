package com.exe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exe.entity.Student;
//import com.exe.service.StudentService;

@Repository
public interface StudentReposiory extends JpaRepository<Student, Integer>{

	

}
