package com.TicketingSystem.Backend.entity;
import com.TicketingSystem.Backend.service.TicketPoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.concurrent.TimeUnit;

@Component
public class Vendor implements Runnable {
    private TicketPoolService ticketPoolService;

    @Autowired
    public Vendor(TicketPoolService ticketPoolService) {
        this.ticketPoolService = ticketPoolService;
    }

    @Override
    public void run() {
        while (!Thread.currentThread ().isInterrupted()) {
            try{
                TimeUnit.SECONDS.sleep (2);
                ticketPoolService.addTickets (10);
                System.out.println ("Vendor added tickets. Total tickets available:"+ ticketPoolService.getAvailableTickets ());
            }catch (InterruptedException e){
                System.out.println ("Vendor interrupted.stopping...");
                Thread.currentThread ().interrupt ();
                break;
            }
        }
    }
}
