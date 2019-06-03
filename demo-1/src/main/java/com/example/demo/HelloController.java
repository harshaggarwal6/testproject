package com.example.demo;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mashape.unirest.http.exceptions.UnirestException;

@RestController
public class HelloController {

	@Autowired
	private Example example;
	
	@Autowired
	private App app;

	@GetMapping
	public String hello() throws IOException, UnirestException {

		app.main();
		return "hello heroku, mail send--" + example.main();
	}
}
