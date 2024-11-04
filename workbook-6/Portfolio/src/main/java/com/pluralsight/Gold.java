package com.pluralsight;

public class Gold extends FixedAsset{
    private double weight;

    public Gold( double value, double weight) {
        super("Gold", 0);
        this.weight = weight;
    }

    @Override
    public double getValue() {
        double newValue= 0;
        return newValue + (weight*100);
    }
}
