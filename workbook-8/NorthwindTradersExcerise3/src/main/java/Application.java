import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            if (args.length != 2) {
                System.out.println(" Please enter Username and password to begin application.");
                System.exit(1);
            }
            String username = args[0];
            String password = args[1];
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/northwind",
                    username,
                    password
            );

            Scanner scanner = new Scanner(System.in);
            boolean running = true;
            while (running) {
                System.out.println("Choose an option");
                System.out.println("1) Display all products");
                System.out.println("2) Display all customers");
                System.out.println("X) Exit");

                String input = scanner.nextLine().trim();

                switch (input.toLowerCase()) {
                    case "1":
                       getAllProducts();
                        break;
                    case "2":
                        processGetByMakeModelRequest(scanner);
                        break;
                    case "X":
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid option");
                        break;


                }


            }
            scanner.close();


        } catch (Exception ex) {
            System.out.println("An error has occurred!");
            ex.printStackTrace();
        }
    }

public static void getAllProducts(){
  String query = """
          SELECT ProductName FROM products
          """;

}
}
