package com.pluralsight;

import Models.Shippers;
import org.apache.commons.dbcp2.BasicDataSource;

import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.exit(1);
        }
        String username = args[0];
        String password = args[1];
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/northwind");
        dataSource.setUsername(username);
        dataSource.setPassword(password);
 DataManager dataManager = new DataManager(dataSource);
      //  List<Shippers> shippers = dataManager
        Scanner scanner=new Scanner(System.in);

        System.out.println("What is the company name");
        String name = scanner.nextLine();
        System.out.println("What is the phone number");
        String number= scanner.nextLine();
        dataManager.getNewUserData(name,number);
        dataManager.displayShippers();
        System.out.println("--------------------------------");

        System.out.println("What is the shipper id of the number you would like to change");
        int idNumber= scanner.nextInt();
        System.out.println("What is the new phone number");
        String pNumber=scanner.nextLine();
        dataManager.changeShipperPhoneNumber(idNumber,pNumber);
        dataManager.displayShippers();
        System.out.println("--------------------------------");

        System.out.println("Enter Id of shipper you would like to delete");
        int id= scanner.nextInt();
        dataManager.deleteShipper(id);





    }
}
