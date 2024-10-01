package com.pluralsight;

import java.util.Scanner;

public class fullNameGenerator {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        String firstName = getfirstName(myscan);
        String middleName = getmiddleName(myscan);
        String lastName = getlastName(myscan);
        String suffix = getSuffix(myscan);
        printFullname(firstName, middleName, lastName, suffix);

    }

    public static String getfirstName(Scanner myscan) {
        System.out.println("Enter your  first name: ");
        return myscan.nextLine();
    }

    public static String getmiddleName(Scanner myscan) {
        System.out.println("Enter your middle name: ");
        return myscan.nextLine();

    }

    public static String getlastName(Scanner myscan) {
        System.out.println("Enter your last name: ");
        return myscan.nextLine();
    }

    public static String getSuffix(Scanner myscan) {
        System.out.println("Enter suffix: ");
        return myscan.nextLine();
    }

    public static void printFullname(String firstName, String middleName, String lastName, String suffix) {
        String fullName = firstName;
        if (middleName.isEmpty()) {
            fullName += " ";
        } else {
            fullName += " " + middleName;
        }
        fullName += " " + lastName;

        if (suffix.isEmpty()) {



        }else{
            fullName += ", " + suffix;
        }
        System.out.println(fullName);


    }
}


