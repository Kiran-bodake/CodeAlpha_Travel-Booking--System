package com.codealpha.tbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codealpha.tbs.entity.Transportation;
import com.codealpha.tbs.service.TransportationService;

@RestController
@RequestMapping("/api/transportations")
public class TransportationController {
    @Autowired
    private TransportationService transportationService;

    @GetMapping("/all")
    public List<Transportation> getAllTransportations() {
        return transportationService.getAllTransportations();
    }
    
    @PostMapping
    public Transportation addTransportation(@RequestBody Transportation transportation) {
        return transportationService.addTransportation(transportation);
    }

    @PutMapping("/{id}")
    public Transportation updateTransportation(@PathVariable Long id, @RequestBody Transportation transportationDetails) {
        return transportationService.updateTransportation(id, transportationDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteTransportation(@PathVariable Long id) {
        transportationService.deleteTransportation(id);
    }
}
