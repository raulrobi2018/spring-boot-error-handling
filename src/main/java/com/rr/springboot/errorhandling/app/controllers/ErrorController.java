package com.rr.springboot.errorhandling.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController {

	@GetMapping({ "/", "/index" })
	public String index() {
		
		int value = 100/0;
		return "index2";
	}

}
