package com.pluralsight;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class theaterReservations {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        getResvstion(myscan);

    }

    public static void getResvstion(Scanner myscan) {
        DateTimeFormatter dateRes = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        System.out.println("What is your Name: ");
        String[] name = myscan.nextLine().trim().split(" ");

        System.out.println("What day would you like to see a show? (MM/DD/YYYY) ");
        LocalDate reservation = LocalDate.parse(myscan.nextLine(), dateRes);

        System.out.println("How many tickets would you like? ");
       int ticketCount = Integer.parseInt(myscan.nextLine());

        if (ticketCount > 1 ){
            System.out.println( ticketCount +" tickets reserved for " + reservation + " for "+ name[1]+", "+name[0]);
        }else{
            System.out.println("One Ticket has been reserved for " + reservation + " for "+ name[1]+", "+name[0]);
        }





        }
    }

