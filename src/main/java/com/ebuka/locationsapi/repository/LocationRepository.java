package com.ebuka.locationsapi.repository;

import com.ebuka.locationsapi.entity.Location;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * LocationRepository
 */
@Repository
public interface LocationRepository extends CrudRepository<Location, Long> {

    
}