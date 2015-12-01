package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import domain.AngularTest;

@Controller
@RequestMapping("/angular")
public class AngularTestController {

	@RequestMapping("/test")
	public @ResponseBody AngularTest test(){
		AngularTest test = new AngularTest();
		test.setAño(1994);
		test.setTitle("El buen título");
		return test;
	}
	
}
