package zju.ningkai.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public @ResponseBody String test(){
		return "Hello World! This is from Spring MVC";
	}
	

	@RequestMapping("/hi")
	public @ResponseBody String sayHi(){
		return "Hi World! This is from Spring MVC";
	}

}
