package com.sl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String abc() {
		
		return "home"; // go to /WEB-INF/views/home.jsp
	}

}
