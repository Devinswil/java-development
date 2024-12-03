package com.pluralsight;

import models.Actor;
import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/sakila");
        dataSource.setUsername("root");
        dataSource.setPassword("P@ssw0rd");

        DataManager manager = new DataManager(dataSource);

        Scanner scanner=new Scanner(System.in);

        System.out.println("please enter the lastName of the actor");
        String lastName= scanner.next();
        Actor actor= manager.getActorWithLastName(lastName);
        System.out.println(actor);

    }


}
