package com.ebuka.locationsapi.service;

import java.util.List;

import com.ebuka.locationsapi.entity.Location;

import org.springframework.stereotype.Service;

@Service
public interface LocationService{
    List<Location> retrieveLocations();
}