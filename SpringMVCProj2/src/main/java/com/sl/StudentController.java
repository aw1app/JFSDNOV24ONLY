package com.sl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

	@GetMapping("/list-students")
	public String listOfstudents(Model model) {

		List<Student> students = new ArrayList<>();

		students.add(new Student(1, "John Doe", "Computer Science", 20));
		students.add(new Student(2, "Jane Smith", "Mathematics", 21));
		students.add(new Student(3, "Mike Johnson", "Physics", 19));
		students.add(new Student(4, "Sarah Williams", "Chemistry", 22));

		// Create a model object and put the above student list in the model.
		model.addAttribute("studentList", students);
		model.addAttribute("pageTitle", "Student List");

		return "list-of-students";
	}

}
