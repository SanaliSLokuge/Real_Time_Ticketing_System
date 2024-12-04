package com.TicketingSystem.Backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.TicketingSystem.Backend.service.TicketService;

@RestController
public class TicketController {
    @Autowired
    private TicketService ticketService;

    @GetMapping("/tickets")
    public String getTickets() { //fetch tickets
        return ticketService.getAvailableTickets ();
    }
}
