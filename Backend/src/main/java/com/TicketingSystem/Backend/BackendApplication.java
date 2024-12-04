package com.TicketingSystem.Backend;

import com.TicketingSystem.Backend.controller.SimulationController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication  implements CommandLineRunner {
	@Autowired
	private SimulationController simulationController;

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		simulationController.start ();
		Thread.sleep (10000);
		simulationController.stop ();
		System.out.println("Simulation stopped.");
	}
}
