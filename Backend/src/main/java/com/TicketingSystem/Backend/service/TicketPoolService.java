package com.TicketingSystem.Backend.service;
import org.springframework.stereotype.Service;

@Service
public class TicketPoolService {
    private int availableTickets;
    private int maxTicketsCapacity;

    public TicketPoolService() {
        this.availableTickets = 100;
        this.maxTicketsCapacity = 100;
    }
    public synchronized boolean purchaseTicket() {
        if (availableTickets > 0) {
            availableTickets--;
            return true;
        }
        return false;
    }
    public synchronized void addTickets(int tickets) {
        if (availableTickets+ tickets <= maxTicketsCapacity) {
            availableTickets += tickets;
            System.out.println (tickets + " tickets added to the pool. Total tickets available:" + availableTickets);
        }else{
            System.out.println ("Pool is full.Cannot add tickets.Try again later.");
        }
    }
    public synchronized int getAvailableTickets() {
        return availableTickets;
    }
}
