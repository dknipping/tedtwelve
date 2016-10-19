package com.prodyna.ted;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@RequestMapping(value="/helloworld", method = RequestMethod.GET)
	public HttpEntity<String> helloWorld() {
		return new ResponseEntity<String>("Hello TED #12", HttpStatus.OK);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
