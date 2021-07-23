package com.cognizant.awsbeanstalkdeployexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsBeanstalkDeployExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsBeanstalkDeployExampleApplication.class, args);
	}
	
	@GetMapping("/")
	public String hello()
	{
		return "welcome to aws elastic beanstalk";
	}
	
	@GetMapping("/hello/{name}")
	public String hello(@PathVariable String name)
	{
		return "hi "+name+" welcome to aws elastic beanstalk deployment";
	}

}
