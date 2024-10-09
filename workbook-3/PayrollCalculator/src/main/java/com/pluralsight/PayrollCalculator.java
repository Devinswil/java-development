package com.pluralsight;

import java.io.*;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        String fileName = "employees.csv";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split("\\|");
                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);

                Employee employee = new Employee(id, name, hoursWorked, payRate);

                FileWriter typer = new FileWriter("employees.csv");
                BufferedWriter bTyper = new BufferedWriter(typer);
                Scanner myscan = new Scanner(System.in);
                System.out.println("What is the file name?");
                String newFile = myscan.nextLine();
                bTyper.write(newFile);

            }
            reader.close();
        } catch (IOException e) {
            System.err.println("Error reading file: " + fileName);
        }
    }
}
