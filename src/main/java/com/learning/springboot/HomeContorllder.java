package com.learning.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeContorllder {

	@RequestMapping("home")
	@ResponseBody
	public String home() {
		return "home.jsp";
	}
}
