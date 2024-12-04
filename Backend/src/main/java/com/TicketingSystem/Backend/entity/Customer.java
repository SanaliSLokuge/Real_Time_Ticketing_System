package com.TicketingSystem.Backend.entity;
import com.TicketingSystem.Backend.service.TicketPoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.concurrent.TimeUnit;

@Component
public class Customer implements Runnable{
    private TicketPoolService ticketPoolService;
    private boolean running = true;

    @Autowired
    public Customer(TicketPoolService ticketPoolService) {
        this.ticketPoolService = ticketPoolService;
    }

    @Override
    public void run() {
        while (running) {
            try{
                TimeUnit.SECONDS.sleep (1);
                if (ticketPoolService.purchaseTicket ()){
                    System.out.print("");
                }else {
                    System.out.println("No tickets available. Customer Waiting...");
                }
            }catch (InterruptedException e){
                System.out.println("Customer interrupted.");
                running=false;
                Thread.currentThread ().interrupt ();
            }
        }
    }
}
