package com.TicketingSystem.Backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import com.TicketingSystem.Backend.entity.Configuration;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/configuration")
public class ConfigurationController {
    private Configuration configuration;

    @Autowired
    public ConfigurationController(Configuration configuration) {
        this.configuration = configuration;
    }
    @GetMapping("/get")
    public Configuration getConfiguration() {
        return configuration;
    }
    @PostMapping("/set")
    public void setConfiguration(@Valid @RequestBody Configuration configuration) {
        this.configuration.setMaxTicketCapacity (configuration.getMaxTicketCapacity ());
        this.configuration.setMaxTicketsByVendor (configuration.getMaxTicketsByVendor ());
        this.configuration.setMaxTicketsByCustomer (configuration.getMaxTicketsByCustomer ());
        this.configuration.setTicketReleaseRate (configuration.getTicketReleaseRate ());
        this.configuration.setTicketRetrievalRate (configuration.getTicketRetrievalRate ());
        System.out.println ("Configuration updated: " + configuration.toString ());
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveConfiguration(@Valid @RequestBody Configuration configuration) {
        // Your logic to save the configuration
        return ResponseEntity.ok("Configuration saved successfully!");
    }

}
