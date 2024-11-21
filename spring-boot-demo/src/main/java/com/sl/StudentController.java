package com.sl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
	
	
	@GetMapping("/hi")
	@ResponseBody
	public String listOfstudents(Model model) {
		
		return "Hi Hello";		
		
	}

}
