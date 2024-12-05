package com.TicketingSystem.Backend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import com.TicketingSystem.Backend.entity.Ticket;
import com.TicketingSystem.Backend.service.TicketPoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.TicketingSystem.Backend.service.TicketPoolService;

@RestController
@RequestMapping("/api")
public class TicketController {
    @Autowired
    private TicketPoolService ticketPoolService;

    @Autowired
    private Ticket ticket;

    @GetMapping("/ticket")
    public int getTickets() { //fetch tickets
        return ticketPoolService.getAvailableTickets ();
    }
    @GetMapping("/ticket-status")
    public String getTicketStatus() {
        try {
            int availableTickets = ticketPoolService.getAvailableTickets(); // Get available tickets
            return "Available tickets: " + availableTickets; // Return the count of available tickets
        } catch (Exception e) {
            return "Error fetching ticket status: " + e.getMessage(); // Error message in case of failure
        }
    }
}
