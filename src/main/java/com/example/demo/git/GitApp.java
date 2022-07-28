package com.example.demo.git;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class GitApp {
	//changes for bug 121
	String s="Luisa";


	//making changes for 101
	int i=10;
	int j=20;
	


	Boolean b1=Boolean.valueOf("True");
	float f=687.6f;
	
@Bean
	public void git1()
	{
		System.out.println("Hello luisa.............");
	}
	
}
