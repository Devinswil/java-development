package com.pluralsight;

public class userFace<T extends FixedList>{
    public static void main(String[] args) {
        FixedList<String> names = new FixedList<>(3);
        names.add("John");
        names.add("Chris");
        names.add("Goof");
        names.add("Greg");

        System.out.println(names.getItems());

    }

}
