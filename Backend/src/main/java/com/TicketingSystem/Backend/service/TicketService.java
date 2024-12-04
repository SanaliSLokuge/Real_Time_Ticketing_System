package com.TicketingSystem.Backend.service;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
    public String getAvailableTickets() {
        return "Tickets Available";
    }
}
