package com.dox.springboot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	String password = "1234";

	//create a mapping for "/hello"
	@GetMapping("/hello")
	public String sayHello() {
		return "helloworld";
	}
}
