package com.TicketingSystem.Backend.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.TicketingSystem.Backend.service.VendorService;

@RestController
public class VendorController {
    @Autowired
    private VendorService vendorService;

    @GetMapping("/vendor")
    public String getVendorDetails(){
        return vendorService.getVendorDetails();
    }
}
