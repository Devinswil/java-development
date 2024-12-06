package com.pluralsight.NorthwindTradersSpringBootExcerise2;

import models.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import services.ProductService;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class NorthwindTradersSpringBootExcerise2Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(NorthwindTradersSpringBootExcerise2Application.class, args);
        ProductService productService = context.getBean(ProductService.class);
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("========== Ledger Application ==========");
            System.out.println("1. List Products");
            System.out.println("2. Add Product");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Search Product");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consumes the newline character after the integer input.
            switch (choice) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    break;
                default:
                    System.out.println("invalid choice");
            }
        } while (choice != 0);
      scanner.close();
    }
private static void listProducts(ProductService productService){
	System.out.println("======Products======");
	List<Product> products = productService.getAllProducts();
	for (Product product : products) {
		System.out.println(product);

	}
	System.out.println();
}
private static void addProduct(Scanner scanner, ProductService productService){
	System.out.println("Enter product amount: ");
	double amount= scanner.nextDouble();
	scanner.nextLine();
	System.out.println("");
}
}
