package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        System.out.println("What is your Full Name:");
        String name = myscan.nextLine();
        System.out.println("What is the billing street address:");
        String bstreet = myscan.nextLine();
        System.out.println("What is the billing city address:");
        String bcity = myscan.nextLine();
        System.out.println("What is the billing state address:");
        String bstate = myscan.nextLine();
        System.out.println("What is your billing zipcode:");
        String bzipCode = myscan.nextLine();
        System.out.println("What is the Street you live on:");
        String street = myscan.nextLine();
        System.out.println("What is the city ypu live in:");
        String city = myscan.nextLine();
        System.out.println("What is the state you live in:");
        String state = myscan.nextLine();
        System.out.println("What is your zipcode:");
        String zipCode = myscan.nextLine();
String name1 = ("Billing Address: ");
String name2 =("Mailing Address: ");
        StringBuilder baddressBuilder = new StringBuilder();
        baddressBuilder.append(name1).append("\n").append(name).append("\n").append(bstreet).append("\n").append(bcity).append(" ").append(bstate).append(", ").append(bzipCode).append("\n");
        System.out.println(baddressBuilder);

        StringBuilder addressBuilder = new StringBuilder();
        addressBuilder.append(name2).append("\n").append(name).append("\n").append(street).append("\n").append(city).append(" ").append(state).append(", ").append(zipCode);
        System.out.println(addressBuilder.toString());




    }
}
