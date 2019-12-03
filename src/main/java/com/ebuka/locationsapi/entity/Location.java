package com.ebuka.locationsapi.entity;

import javax.persistence.*;

@Entity
public class Location{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String address;
    

    public Location(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Location id(Long id) {
        this.id = id;
        return this;
    }

    public Location name(String name) {
        this.name = name;
        return this;
    }

    public Location address(String address) {
        this.address = address;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Location)) {
            return false;
        }
        Location location = (Location) o;
        return Objects.equals(id, location.id) && Objects.equals(name, location.name) && Objects.equals(address, location.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", address='" + getAddress() + "'" +
            "}";
    }
    
}