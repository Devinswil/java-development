package com.pluralsight;

import java.util.Scanner;

public class sandwhichShop {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);

        System.out.println("What size sandwich would you like 1 or 2?");
        double sandwichSize = myscan.nextInt();

        double price = 0.0;
        if(sandwichSize == 1) {
            price = 5.45;} else if (sandwichSize == 2)
        {price = 8.95;}

        myscan.nextLine();
        System.out.println("Would you like to make sandwich loaded");
        String loadedSandwhich = myscan.nextLine();
        double loaded = 0.0;
        if(loadedSandwhich.equalsIgnoreCase("yes")) {
            loaded = 1.75;} else if (loadedSandwhich.equalsIgnoreCase("no"))
        {loaded = 0.0;}



        System.out.println("What is your age");
        int age = myscan.nextInt();

        double discountAge = 0.0;
        if (age <=17){
            discountAge = 0.1;
        }else if (age >=65){discountAge = 0.2;}

        double totalprice = (price + loaded) * (1 -discountAge);

        System.out.println( "Your sandwich will be: " + totalprice);






    }
}



