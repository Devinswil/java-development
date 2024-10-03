package com.pluralsight;

public class Cellphone {
    private double serialNumber;
    private String model;
    private String carrier;
    private double phoneNumber;
    private String ownerName;

    public Cellphone{
        serialNumber = 0;
        model = "";
        carrier = "";
        phoneNumber = "";
        ownerName = "";
    }

    public double getSerialNumber() {
        return serialNumber;
    }

    public String getModel() {
        return model;
    }

    public String getCarrier() {
        return carrier;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }
}
