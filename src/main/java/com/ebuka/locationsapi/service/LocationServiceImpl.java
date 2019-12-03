package com.ebuka.locationsapi.service;

import java.util.List;

import com.ebuka.locationsapi.entity.Location;
import com.ebuka.locationsapi.repository.LocationRepository;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * LocationServiceImpl
 */
public class LocationServiceImpl implements LocationService {

    @Autowired
    LocationRepository locationRepo;
    
    @Override
    public List<Location> retrieveLocations() {
        return (List<Location>) locationRepo.findAll();
    }
}