package com.codealpha.tbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codealpha.tbs.entity.Transportation;
import com.codealpha.tbs.repository.TransportationRepository;

@Service
public class TransportationService {
    @Autowired
    private TransportationRepository transportationRepository;
    
    public List<Transportation> getAllTransportations() {
        return transportationRepository.findAll();
    }

    public Transportation addTransportation(Transportation transportation) {
        return transportationRepository.save(transportation);
    }

    public Transportation updateTransportation(Long id, Transportation transportationDetails) {
        Transportation transportation = transportationRepository.findById(id).orElseThrow(() -> new RuntimeException("Transportation not found"));
        transportation.setType(transportationDetails.getType());
        transportation.setOrigin(transportationDetails.getOrigin());
        transportation.setDestination(transportationDetails.getDestination());
        transportation.setPrice(transportationDetails.getPrice());
        transportation.setAvailableSeats(transportationDetails.getAvailableSeats());
        return transportationRepository.save(transportation);
    }

    public void deleteTransportation(Long id) {
        transportationRepository.deleteById(id);
    }
}