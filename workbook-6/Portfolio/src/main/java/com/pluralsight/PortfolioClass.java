package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class PortfolioClass implements IValuable {
    private String name;
    private String owner;
    List<IValuable> assets;

    public PortfolioClass(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<>();

    }

    public void addAsset(IValuable asset) {
        assets.add(asset);
    }


    public IValuable getMostValuable() {
        return null;
    }

    public IValuable getLeastValuable() {
        return null;
    }

    @Override
    public double getValue(IValuable asset) {
        double value = 0;
        for (IValuable iValuable : assets) {
            value += iValuable.getValue();
        }


        return value;
    }

    @Override
    public double getValue() {
        return 0;
    }
}

