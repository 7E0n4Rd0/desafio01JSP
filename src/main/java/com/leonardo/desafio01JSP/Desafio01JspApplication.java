package com.leonardo.desafio01JSP;

import com.leonardo.desafio01JSP.entities.Order;
import com.leonardo.desafio01JSP.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Desafio01JspApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {

		SpringApplication.run(Desafio01JspApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Product Code: ");
		int code = scanner.nextInt();

		System.out.print("Enter the Basic value in R$: ");
		scanner.nextLine();
		double basic = scanner.nextDouble();

		System.out.print("Enter the discount: ");
		double discount = scanner.nextDouble();
		Order order = new Order(code, basic, discount);

		System.out.printf("\nProduct Code %d\nTotal: R$%.2f", order.getCode(), orderService.total(order));

		scanner.close();
	}
}
