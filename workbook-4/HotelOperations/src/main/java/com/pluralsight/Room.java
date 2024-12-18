package com.pluralsight;

public class Room {
    private int numberOfBed;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isCleanRoom;



    public Room(int numberOfBed, double price) {
        this.numberOfBed = numberOfBed;
        this.price = price;
        this.isOccupied = false;
        this.isDirty = false;

    }

    public int getNumberOfBed() {
        return numberOfBed;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }
    public boolean isAvailable(){
        return !isDirty && !isOccupied;
    }
    public void checkIn(){
        if (!isOccupied && !isDirty) {
            isOccupied = true;
            isDirty = true;
        }
    }                ;
    public void checkOut(){
        isOccupied=false;
    }
    public void CleanRoom() {
        if (!isOccupied) {
            isDirty = false;
        }
    }
}




















































