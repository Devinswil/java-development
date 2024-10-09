package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class StoreApp {
    // the key is the product id, the value is a product object
   static HashMap<Integer, Product> inventory = new HashMap<>();
   public static void main(String[] args) {
// this method loads product objects into inventory
        loadInventory();
        Scanner scanner = new Scanner(System.in);
        System.out.print("What item # are you interested in? ");
        int id = scanner.nextInt();
        Product matchedProduct = inventory.get(id);
        if (matchedProduct == null) {
            System.out.println("We don't carry that product");
            return;
        }
        System.out.printf("We carry %s and the price is $%.2f",
                matchedProduct.getName(), matchedProduct.getPrice());

    }

    private static void loadInventory() {
       String line;
        try {
            BufferedReader br = new BufferedReader(new FileReader("inventory1.csv"));
            String input;
            while((input=br.readLine())!=null){
                String[] sections= line.split("\\|");
                System.out.println(input);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        inventory.put(451,new Product(451,"apple",45));
        inventory.put(471,new Product(471,"Red apple",44));
        inventory.put(4561,new Product(4561,"Green apple",4));
        inventory.put(4591,new Product(4591,"Snapple apple",94));
    }
}
