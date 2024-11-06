package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<Person> people = createPeopleList();

        System.out.print("Enter a name to search: ");
        Scanner scanner = new Scanner(System.in);
        String searchName = scanner.nextLine();



        List<Person> matchingPeople1 = people
                .stream()
                .filter(person -> person.getFirstName()
                        .equalsIgnoreCase(searchName) || person.getLastName()
                        .equalsIgnoreCase(searchName))
                .toList();
        //printing it out
        matchingPeople1.forEach(System.out::println);



        double averageAge = calculateAverageAge(people);


        int oldestAge = findOldestAge(people);
        System.out.println("Oldest person's age: " + oldestAge);

        int youngestAge = findYoungestAge(people);
        System.out.println("Youngest person's age: " + youngestAge);
    }

    private static List<Person> createPeopleList() {
        List<Person> people = new ArrayList<>();
        // Add at least 10 people to the list
        people.add(new Person("John", "Doe", 25));
        people.add(new Person("Jane", "Smith", 30));
        people.add(new Person("Michael", "Johnson", 35));
        people.add(new Person("Emily", "Brown", 22));
        people.add(new Person("David", "Miller", 40));
        people.add(new Person("Sarah", "Davis", 28));
        people.add(new Person("Daniel", "Anderson", 33));
        people.add(new Person("Jessica", "Wilson", 27));
        people.add(new Person("Matthew", "Martinez", 31));
        people.add(new Person("Olivia", "Taylor", 29));

        return people;
    }

    private static double calculateAverageAge(List<Person> people) {
        Double averageAge=people.stream().mapToInt(Person::getAge).average().orElse(0);
        System.out.println(averageAge);

    private static int findOldestAge(List<Person> people) {

        List<Integer>sortedAges=people.stream().map(Person::getAge).sorted().toList();
        int maxAge =sortedAges.get(sortedAges.size()-1);
            System.out.println(maxAge);


    private static int findYoungestAge(List<Person> people) {
                List<Integer> sortedAges2 = people.stream().map(Person::getAge).sorted().toList();
                int minAge = sortedAges.get(0);
                return minAge;
            }