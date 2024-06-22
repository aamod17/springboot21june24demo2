package com.AmodIT;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JlcSpringbootDemo1Application implements CommandLineRunner{

	public static void main(String[] args) {
		System.out.println("*********************main() method starts************************");
		SpringApplication.run(JlcSpringbootDemo1Application.class, args);
		System.out.println("******************main() method end*****************");
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("*****************run() method from CommandLineRunner Interface**************");
		// Task- 101 
		int x = 10;
		int y = 20;
		int z = x+y;
		
	}

}
