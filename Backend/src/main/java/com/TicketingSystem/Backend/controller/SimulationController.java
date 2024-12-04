package com.TicketingSystem.Backend.controller;
import com.TicketingSystem.Backend.entity.Customer;
import com.TicketingSystem.Backend.entity.Vendor;
import com.TicketingSystem.Backend.service.TicketPoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimulationController {
    private Vendor vendor;
    private Customer customer;
    private Thread vendorThread;
    private Thread customerThread;

    @Autowired
    public SimulationController(Vendor vendor, Customer customer) {
        this.vendor = vendor;
        this.customer = customer;
    }
    public void start(){
        vendorThread = new Thread(vendor);
        customerThread = new Thread(customer);
        vendorThread.start();
        customerThread.start();
        System.out.println("Simulation starting.");
    }
    public void stop(){
        if (vendorThread.isAlive() && customerThread.isAlive()){
            vendorThread.interrupt();
            customerThread.interrupt();
            System.out.println("Simulation stopping.");
        }
    }
}
