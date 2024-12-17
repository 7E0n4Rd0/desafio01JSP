package com.leonardo.desafio01JSP;

import com.leonardo.desafio01JSP.entities.Order;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Desafio01JspApplication implements CommandLineRunner {


	public static void main(String[] args) {

		SpringApplication.run(Desafio01JspApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1034, 150.00, 20.00);
	}
}
