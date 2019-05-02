package com.rest.quiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@SpringBootApplication
public class RestQuizEpitaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestQuizEpitaApplication.class, args);
	}

}
