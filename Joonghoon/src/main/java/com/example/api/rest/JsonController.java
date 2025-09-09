package com.example.api.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class JsonController {
	
	@GetMapping("/uuuuuuuu")
	public String version() {
		
		String a = "";
		// 오.
		return "1.0000000000";
	}
}
