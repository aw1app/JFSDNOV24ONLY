package com.sl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
	
	
	@GetMapping("/hi")
	@ResponseBody
	public String hi(Model model) {
		
		return "Hi Hello";			
	}
	
	@GetMapping("/hi2")
	@ResponseBody
	public String hi2(Model model) {
		
		return "Hi Hello 2";			
	}
	
	@GetMapping("/home")
	public String home(Model model) {
		
		return "home";		// goes to /WEB-INF/views/home.jsp	
	}

}
