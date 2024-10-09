package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class StoreApp {

    public static void main(String[] args) {


        ArrayList<Product> inventory = getInventory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("We carry the following inventory: ");
        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("id: %d %s - Price: $%.2f",
                    p.getId(), p.getName(), p.getPrice());
        }
    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();
        inventory.add(new Product(1, "Apples", 40));
        inventory.add(new Product(2, "Chips", 49));
        inventory.add(new Product(3, "Soda", 100));
        inventory.add(new Product(4, "Water", 50));
        inventory.add(new Product(5, "Frozen Water", 25));
// and its details are not shown
        return inventory;
    }
}


