import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@GetMapping("/hello")
	@ResponseBody
	public String helloooo() {
		
		return "Hello Hello";  
	}
	
	
	@GetMapping("/home2")
	public String abc() {		
		return "home"; // go to /WEB-INF/views/home.jsp
	}
	
	@RequestMapping(path="/applications/{appId}/versions", method=RequestMethod.POST)
	public String abc2( @PathVariable int appId) {
		if(appId==100) {
			
		}
		
		return "home"; // go to /WEB-INF/views/home.jsp
	}

}
