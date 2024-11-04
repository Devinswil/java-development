package com.pluralsight;

public class House extends FixedAsset {
    private int yearBuilt;
    private int squareFeet;
    private int bedroom;

    public House(String name, double value, int yearBuilt, int squareFeet, int bedroom) {
        super("House", 0);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedroom = bedroom;
    }

    @Override
    public double getValue() {
        double newValue = 0;
        return newValue + 1000;

    }
}
