package com.example.demo;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Students")
public class StudentController {
	ArrayList<Student> students = new ArrayList<Student>();
	
	@GetMapping("/GetStudents")
	public String getStudents(){
		return "Hello I am gaurav !!";
	}
	
	@GetMapping("/ListStudents")
	public ArrayList<Student> listStudents(){
		return students;
	}
	
	@PostMapping("/addStudents")
	public String addStudents(@RequestBody Student stu) {
//		Student stu = new Student();
//		stu.setName(name);
//		stu.setDept(dept);
//		stu.setAge(age);
//		students.add(stu);
		students.add(stu);
		return "Students Added";
	}
}
