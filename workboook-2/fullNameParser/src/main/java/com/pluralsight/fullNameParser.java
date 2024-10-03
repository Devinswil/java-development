package com.pluralsight;

import java.util.Scanner;

public class fullNameParser {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        getName(myscan);


    }

    public static void getName(Scanner myscan) {
        System.out.println("Enter your Full Name: ");
        String[] input = myscan.nextLine().trim().split(" ");

        switch (input.length) {
            case 1:
                System.out.println("\nFirst Name: " + input[0] + "\nMiddle Name: n/a\n Last Name: n/a ");
                break;
            case 2:
                System.out.println("\nFirst Name: " + input[0] + "\nMiddle Name: n/a" + "\nLast Name: " + input[1]);
                break;
            case 3:
                System.out.println("\nFirst Name: " + input[0] + "\nMiddle Name: " + input[1] + "\nLast Name: " + input[2]);
                break;


        }


    }
}




