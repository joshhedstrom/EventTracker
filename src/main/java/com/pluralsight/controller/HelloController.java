package com.pluralsight.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class HelloController {

	@RequestMapping(value = "/greeting")
	public String sayHello(Model model) {

		model.addAttribute("greeting", "Hello World");
		return "hello.jsp";

	}

}
