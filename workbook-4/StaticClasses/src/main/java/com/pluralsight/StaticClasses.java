package com.pluralsight;

import java.util.Scanner;

public class StaticClasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your prefix?");
        String prefix = scanner.nextLine();
        System.out.println("What is your first name?");
        String firstName = scanner.nextLine();
        System.out.println("What is your middle name?");
        String middleName = scanner.nextLine();
        System.out.println("What is your last name?");
        String lastName = scanner.nextLine();
        System.out.println("What is your suffix?");
        String suffix = scanner.nextLine();

        System.out.println(NameFormatter.format(prefix,firstName,middleName,lastName,suffix));;
        System.out.println(NameFormatter.format(firstName,lastName));

    }

}
