package com.TicketingSystem.Backend.entity;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Min;
import org.springframework.stereotype.Component;

@Component
public class Configuration {
    @NotNull(message = "Max Tickets by Vendor cannot be null")
    @Min(value = 1, message = "Max Tickets by Vendor must be greater than 0")
    private int maxTicketsByVendor;

    @NotNull(message = "Ticket Release Rate cannot be null")
    @Min(value = 1, message = "Ticket Release Rate must be greater than 0")
    private int ticketReleaseRate;

    @NotNull(message = "Max Tickets by Customer cannot be null")
    @Min(value = 1, message = "Max Tickets by Customer must be greater than 0")
    private int maxTicketsByCustomer;

    @NotNull(message = "Ticket Retrieval Rate cannot be null")
    @Min(value = 1, message = "Ticket Retrieval Rate must be greater than 0")
    private int ticketRetrievalRate;

    @NotNull(message = "Max Ticket Capacity cannot be null")
    @Min(value = 1, message = "Max Ticket Capacity must be greater than 0")
    private int maxTicketCapacity;

    public int getMaxTicketsByVendor() {
        return maxTicketsByVendor;
    }
    public void setMaxTicketsByVendor(int maxTicketsByVendor) {
        this.maxTicketsByVendor = maxTicketsByVendor;
    }
    public int getTicketReleaseRate() {
        return ticketReleaseRate;
    }
    public void setTicketReleaseRate(int ticketReleaseRate) {
        this.ticketReleaseRate = ticketReleaseRate;
    }
    public int getMaxTicketsByCustomer() {
        return maxTicketsByCustomer;
    }
    public void setMaxTicketsByCustomer(int maxTicketsByCustomer) {
        this.maxTicketsByCustomer = maxTicketsByCustomer;
    }
    public int getTicketRetrievalRate() {
        return ticketRetrievalRate;
    }
    public void setTicketRetrievalRate(int ticketRetrievalRate) {
        this.ticketRetrievalRate = ticketRetrievalRate;
    }
    public int getMaxTicketCapacity() {
        return maxTicketCapacity;
    }
    public void setMaxTicketCapacity(int maxTicketCapacity) {
        this.maxTicketCapacity = maxTicketCapacity;
    }
}
