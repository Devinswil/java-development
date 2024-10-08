package com.pluralsight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class bedTimeStories {
    public static void main(String[] args) {
        Scanner myscan1 = new Scanner(System.in);
        System.out.println("Which Story would you like to read?");
        String storyname = myscan1.nextLine()+".txt";
        try {
            FileInputStream reader = new FileInputStream(storyname);
            Scanner myscan = new Scanner(reader);
            int linecount= 1;

            while (myscan.hasNextLine()) {
                String line = linecount+ ". "+myscan.nextLine().toLowerCase();
                System.out.println(line);
                linecount++;
            }
            ;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
