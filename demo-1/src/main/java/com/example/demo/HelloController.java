package com.example.demo;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	private Example example;

	@GetMapping
	public String hello() throws IOException {

		return "hello heroku, mail send--" + example.main();
	}
}
