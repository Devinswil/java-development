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
        String input = myscan.nextLine();
        int firstSpaceIndex = input.indexOf(0);
        if (firstSpaceIndex != -1){}
        return input.sub();

    }

    public static String getMiddleName(Scanner myscan) {
        System.out.println("Enter your  middle and last anme: ");
        return myscan.nextLine();
    }


}
