package com.pluralsight;

import java.util.Scanner;

public class fullNameParser {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        String name1 = getfirstName(myscan);
        String name2 = getMiddleName(myscan);

    }

    public static String getfirstName(Scanner myscan) {
        System.out.println("Enter your  first: ");
        return myscan.nextLine();
    }

    public static String getMiddleName(Scanner myscan) {
        System.out.println("Enter your  middle and last anme: ");
        return myscan.nextLine();
    }


}
