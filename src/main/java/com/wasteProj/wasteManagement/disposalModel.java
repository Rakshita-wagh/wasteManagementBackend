package com.wasteProj.wasteManagement;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "wasteData")
public class disposalModel {
    @Id
    private String id;
    private String name;
    private String address;
    private String phoneNumber;
    private String wasteType;

    // Constructor
    public disposalModel(String name, String address, String phoneNumber, String wasteType) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.wasteType = wasteType;
    }

    // No-args constructor
    public disposalModel() {
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getWasteType() {
        return wasteType;
    }

    public void setWasteType(String wasteType) {
        this.wasteType = wasteType;
    }
}
