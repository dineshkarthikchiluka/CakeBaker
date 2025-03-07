package com.example.dk.week1.Week1HomeWork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Week1HomeWorkApplication implements CommandLineRunner {
	@Autowired
	CakeBaker cakeBaker;
	public static void main(String[] args) {
		SpringApplication.run(Week1HomeWorkApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String res = cakeBaker.bakeCake();
		System.out.println(res);
	}
}
