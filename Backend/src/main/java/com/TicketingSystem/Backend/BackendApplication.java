package com.TicketingSystem.Backend;

import com.TicketingSystem.Backend.entity.Customer;
import com.TicketingSystem.Backend.entity.Vendor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication  implements CommandLineRunner {
	@Autowired
	private ApplicationContext applicationContext;

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Vendor vendor = applicationContext.getBean(Vendor.class);
		Customer customer = applicationContext.getBean(Customer.class);
		new Thread (vendor).start();
		new Thread (customer).start();
	}
}
