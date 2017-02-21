package com.jo.educare.web.controllers.teacher;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teacher")
public class TeacherController {

	@GetMapping("/index.html")
	public String home(){
		return "/teacher/index";
	}
	
}
