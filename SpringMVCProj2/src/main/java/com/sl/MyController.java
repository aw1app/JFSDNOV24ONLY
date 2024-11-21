package com.sl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MyController {
	
	@GetMapping("/home")
	public String abc() {
		//Business Logic goes here
		
		
		return "home"; // go to /WEB-INF/views/home.jsp
	}
	
	@GetMapping("/assets/**")
	public String abc1() {
		//Business Logic goes here
		
		
		return "assetsABC"; // go to /WEB-INF/views/assetsABC.jsp
	}
	
	@GetMapping("/applications/{appId}/versions")
	public String abc2(@PathVariable int appId) {
		//Business Logic goes here
		
		System.out.println(" User type appId = "+appId);
		
		return "assetsABC"; // go to /WEB-INF/views/assetsABC.jsp
	}
	

}
