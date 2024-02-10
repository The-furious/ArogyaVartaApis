package com.arogyavarta.arogyavartaapis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@RestController
public class ArogyaVartaApisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArogyaVartaApisApplication.class, args);
	}
	@GetMapping("/hello")
	public String hello(){
		return "Hello Arogya Varta!";
	}
}
