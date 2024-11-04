package com.pluralsight;

public class Jewelry extends FixedAsset{
    private double karat;

    public Jewelry(String name, double value, double karat) {
        super("Jewelry", 0);
        this.karat = karat;
    }



    @Override
    public double getValue() {
        double newValue=0;
        double karatValue = karat *1000;
        return newValue + karatValue;
    }
}
