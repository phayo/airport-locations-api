package com.ebuka.locationsapi.controller;

import java.util.List;

import com.ebuka.locationsapi.entity.Location;
import com.ebuka.locationsapi.service.LocationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController{
    private LocationService locationService;

    @Autowired
    public void setLocationService(LocationService locationService){
        this.locationService = locationService;
    }

    @GetMapping("/location")
    public ResponseEntity<List<Location>> getAllLocations(){
        List<Location> locations = locationService.retrieveLocations();
        return new ResponseEntity<List<Location>>(locations, HttpStatus.OK);
    }
}