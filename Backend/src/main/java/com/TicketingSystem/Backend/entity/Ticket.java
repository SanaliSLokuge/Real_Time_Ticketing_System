package com.TicketingSystem.Backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.stereotype.Component;

//@Entity
//@Table(name = "tciekts")
@Component
public class Ticket {
    private int ticketId;
    private static int ticketCounter=1;
    private String Status;

//    public Ticket(int ticketId, int ticketCount, String Status) {
//        this.ticketId = ticketId;
//        this.ticketCounter = ticketCount;
//        this.Status = Status;
//    }

    public Ticket(int ticketId, String status) {
        this.ticketId = ticketId;
        this.Status = status;
    }

    public Ticket() {
        this.ticketId = getNextTicketId ();
        this.Status="available";
    }
    public int getTicketId() {
        return ticketId;
    }
    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        this.Status = status;
    }
    private synchronized int getNextTicketId() {
        return ticketCounter++;
    }

    @Override
    public String toString() {
        return "Ticket{ ticketId=" + ticketId +", ticketCounter=" + ticketCounter + ", Status='" + Status + '\'' + '}';
    }
}
