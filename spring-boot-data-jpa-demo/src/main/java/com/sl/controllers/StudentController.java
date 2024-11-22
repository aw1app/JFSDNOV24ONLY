package com.sl.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
	public String addNewStudent() {		
		return "add-student"; // add-student.jsp
	}
	
	@PostMapping("/add-student")
	public String processAddNewStudent(Model model, String firstName,String lastName, float age ) {
		
		Student stud =  new Student();
		stud.setAge(age);
		stud.setFirstName(firstName);
		stud.setLastName(lastName);
		
		Student  savedStud = studentRepositry.save(stud);
		
		model.addAttribute("ID", savedStud.getStudentId());
		
		return "add-student-success"; // add-student-success.jsp
	}
	
	
	// Details of Single Student
	@GetMapping("/detail-student/{id}")
	public String getStudentDetails(Model model, @PathVariable int id) {	
		Optional<Student> studentExists = studentRepositry.findById(id);
		
		model.addAttribute("id", id);
		
		if(studentExists.isPresent()) {
			Student  stud = studentExists.get();
			model.addAttribute("student", stud);
		}
		
		return "detail-student"; // detail-student.jsp
	}

}
