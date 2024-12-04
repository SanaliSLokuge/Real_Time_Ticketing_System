package com.TicketingSystem.Backend.service;
import com.TicketingSystem.Backend.entity.Ticket;
import org.springframework.stereotype.Service;
import java.util.concurrent.ConcurrentLinkedQueue;

@Service
public class TicketPoolService {
    private ConcurrentLinkedQueue<Ticket> ticketsQueue;
    private int maxTicketsCapacity;

    public TicketPoolService() {
        this.ticketsQueue= new ConcurrentLinkedQueue<>();
        this.maxTicketsCapacity = 100;
    }
    public synchronized boolean purchaseTicket() {
        if (ticketsQueue.size () > 0) {
            Ticket ticket = ticketsQueue.poll();
            if (ticket != null) {
                ticket.setStatus ("Not Available");
                System.out.println ("Ticket Purchased: "+ticket);
                return true;
            }
        }
        System.out.println("No tickets available. Customer Waiting...");
        return false;
    }
    public synchronized void addTickets(int count) {
        if (ticketsQueue.size ()+count <= maxTicketsCapacity) {
            for (int i = 0; i < count; i++) {
                ticketsQueue.add(new Ticket ());
            }
            System.out.println (count + " tickets added to the pool. Total tickets available:" + ticketsQueue.size ());
        }else{
            System.out.println ("Pool is full.Cannot add tickets.Try again later.");
        }
    }
    public synchronized int getAvailableTickets() {
        return ticketsQueue.size();
    }
}
