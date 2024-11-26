import java.sql.*;
import java.util.Scanner;

public class Application {
    public static Connection connection = null;
    public static PreparedStatement preparedStatement = null;
    public static ResultSet result = null;

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        try {
            if (args.length != 2) {
                System.out.println(" Please enter Username and password to begin application.");
                System.exit(1);
            }
            String username = args[0];
            String password = args[1];
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
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
                       getAllCustomers();
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
        } finally {
            if (result != null) {
                try {
                    result.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void getAllProducts() throws SQLException {
        String query = """
                SELECT ProductName FROM products
                """;
        preparedStatement = connection.prepareStatement(query);
        result = preparedStatement.executeQuery();

        while (result.next()) {
            String productName = result.getString("ProductName");
            System.out.println("ProductName " + productName);

        }
    }

    public static void getAllCustomers() throws SQLException {
        String query = """
                SELECT ContactName FROM customers
                """;
        preparedStatement = connection.prepareStatement(query);
        result = preparedStatement.executeQuery();

        while (result.next()) {
            String contactName = result.getString("ContactName");
            System.out.println("ContactName " + contactName);

        }
    }
}
