package com.template.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class templateService {
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello, Spring MVC Maven Template</h3>This message is coming from templateSrevice.java **********</div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}

}
