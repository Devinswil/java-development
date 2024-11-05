package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        List<Person> names = new ArrayList<>();
        names.add(new Person("John", "Williams", 45));
        names.add(new Person("Emma", "Smith", 32));
        names.add(new Person("Olivia", "Johnson", 27));
        names.add(new Person("James", "Brown", 54));
        names.add(new Person("Ava", "Davis", 40));
        names.add(new Person("William", "Miller", 37));
        names.add(new Person("Sophia", "Wilson", 29));
        names.add(new Person("Benjamin", "Moore", 63));
        names.add(new Person("Charlotte", "Taylor", 50));
        names.add(new Person("Lucas", "Anderson", 21));


        findName(names);
       int average = getAgeAverage(names);
        System.out.println(average);



    }

    public static void findName(List<Person> names) {
        Scanner myscan = new Scanner(System.in);
        List<Person> thisPersonList;
        System.out.println("What name would you like to Search for?");
        String nameToFind = myscan.nextLine();
        boolean found = false;
        for (Person name : names) {
            if (nameToFind.equalsIgnoreCase(name.getLastName()) || nameToFind.equalsIgnoreCase(name.getFirstName())) {
                System.out.println(name.getFirstName() + " " + name.getLastName());
                found=true;

            }
        }
        if (!found){
            System.out.println("Name not found!");
        }

    }
   public static int getAgeAverage(List<Person> names){
       int sum=0;
       for (Person name : names) {
           sum += name.getAge();



       }
       return sum/ names.size();
   }
}
