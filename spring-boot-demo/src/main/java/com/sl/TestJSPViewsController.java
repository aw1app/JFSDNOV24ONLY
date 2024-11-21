package com.sl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestJSPViewsController {
	
	@GetMapping("/home-test")
	public String home(Model model) {
		
		return "abc";		// goes to /WEB-INF/views/abc.jsp	
	}

}
