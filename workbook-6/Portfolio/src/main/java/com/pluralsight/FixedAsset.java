package com.pluralsight;

public class FixedAsset implements IValuable {
    private String name;
    private double value;

    public FixedAsset(String name, double value) {
        this.name = name;
        this.value = value;
    }

   
    public double getValue() {
        return 0;
    }
}
