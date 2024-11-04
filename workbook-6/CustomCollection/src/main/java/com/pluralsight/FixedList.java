package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T>{
    private List<T>items;
    private int maxSize;

    public int getMaxSize() {
        return maxSize;
    }

    public FixedList(int maxSize) {
        this.maxSize = 3;
        this.items=new ArrayList<>();

    }


    public void add(T item) {
        if (items.size() < maxSize) {
            items.add(item);
        } else {
            System.err.println("List is full");
        }
    }
    public List<T>getItems(){

        return items;
    }
}
