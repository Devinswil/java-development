package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class formatDates {
    public static void main(String[] args) {
        LocalDate date =LocalDate.now();
        System.out.println(date);

        DateTimeFormatter fDate= DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String newDate=date.format(fDate);
        System.out.println(newDate);

        DateTimeFormatter mDate= DateTimeFormatter.ofPattern("MMMM,dd,yyyy");
        String qDate= date.format(mDate);
        System.out.println(qDate);
        
        DateTimeFormatter pDate= DateTimeFormatter.ofPattern("EEEEE");







    }
}
