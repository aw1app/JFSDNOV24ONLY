package com.sl.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sl.entities.Student;
import com.sl.respositries.StudentRepositry;

@Controller
public class StudentController {
	
	@Autowired
	StudentRepositry studentRepositry;
	
	@GetMapping("/students-list")
	public String listOfStudents(Model model) {
		
		List<Student> students =  studentRepositry.findAll();
		
		// Create a model object and put the above student list in the model.
		model.addAttribute("studentList", students);
		model.addAttribute("pageTitle", "Student List");
		
		return "student-list"; // student-list.jsp
	}
	
	
	@GetMapping("/add-student")
	public String addNewStudent(Model model) {
		
		return "add-student"; // add-student.jsp
	}

}
