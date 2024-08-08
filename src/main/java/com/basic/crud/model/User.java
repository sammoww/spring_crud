package com.basic.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
//@Entity means that it maps to a table in a database
public class User {
    @Id
    private Integer id;
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
