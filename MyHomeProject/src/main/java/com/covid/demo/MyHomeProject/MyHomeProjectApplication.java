package com.covid.demo.MyHomeProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyHomeProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyHomeProjectApplication.class, args);
	}
	
	@RequestMapping ("/")
	public String getHome()
	{
		
		return "Hello you are at Home"; 
	}

	@RequestMapping ("/room")
	public String getHome(String s)
	{
		
		return s+"Hello you are at Home"; 
	}
}
