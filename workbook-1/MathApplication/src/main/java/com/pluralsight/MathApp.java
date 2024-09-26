package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        float bobSalary = 20_000f;
        float garySalary = 40_000f;
        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is" + highestSalary);

        int carprice = 10000;
        int truckprice = 30000;
        System.out.println(Math.min(carprice, truckprice));

        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println(area);

        double number = 5.0;
        double root = Math.sqrt(number);
        System.out.println("The Square root of 5.0 is" + root);

        double x1 = 5;
        double x2 = 85;
        double y1 = 10;
        double y2 = 50;

       double distance = Math.sqrt((Math.pow(x2 - x1, 2)+Math.pow(y2 - y1, 2)));
        System.out.println(distance);

        double negNumber = -3.8;
        double absNumber = Math.abs(negNumber);
        System.out.println("The absloute number is"+ negNumber);

        System.out.println(Math.random());



    }
}
