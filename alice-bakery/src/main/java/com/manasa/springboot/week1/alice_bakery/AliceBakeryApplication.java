package com.manasa.springboot.week1.alice_bakery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AliceBakeryApplication implements CommandLineRunner {

	@Autowired
	private CakeBaker cakeBaker;

	public static void main(String[] args) {
		SpringApplication.run(AliceBakeryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	cakeBaker.bakeCake();
	}
}
