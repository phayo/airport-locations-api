package com.ebuka.locationsapi.controller;

import java.util.List;
import java.util.Map;

import com.ebuka.locationsapi.entity.Location;
import com.ebuka.locationsapi.service.LocationService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController{
    private LocationService locationService;

    Logger log = LoggerFactory.getLogger(LocationController.class);

    @Autowired
    public void setLocationService(LocationService locationService){
        this.locationService = locationService;
    }

    @GetMapping("/location")
    public ResponseEntity<List<Location>> getAllLocations(){
        List<Location> locations = locationService.retrieveLocations();
        return new ResponseEntity<List<Location>>(locations, HttpStatus.OK);
    }

    @PostMapping("/location")
    public ResponseEntity<String> addLocation(@RequestBody Map<String, String> data){
        // long id = Long.parseLong(req.get("id"));
        System.out.println("Here");
        log.info("Request body: "+ data.get("name") + " " + data.get("address"));
        Location location = new Location(data.get("name"), data.get("address"));
        locationService.addLocation(location);
        return new ResponseEntity<String>("Added successfully", HttpStatus.OK);
    }

    
}