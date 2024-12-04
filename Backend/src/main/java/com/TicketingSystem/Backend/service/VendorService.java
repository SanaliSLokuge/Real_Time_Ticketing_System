package com.TicketingSystem.Backend.service;
import org.springframework.stereotype.Service;

@Service
public class VendorService {
    public String releaseTickets(){
        return "Tickets released by vendor";
    }
    public String getVendorDetails() {
        return "Vendor details here";  // Return actual details as needed
    }
}
