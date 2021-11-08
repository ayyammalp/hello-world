package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@GetMapping(path = "/hello", produces = "application/json")
	public @ResponseBody String getAuthServiceStatus() {
		return "Hello World";
	}

}
