import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Application {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                System.out.println("The application needs a Username and Password to run");
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
            String query = "SELECT ProductID, ProductName, UnitPrice, UnitsInStock FROM products";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet results = statement.executeQuery();
            while (results.next()) {
                int productID = results.getInt("ProductID");
                String productName = results.getString("ProductName");
                double unitPrice = results.getDouble("UnitPrice");
                int unitsInStock = results.getInt("UnitsInStock");

                System.out.println("productID: " + productID);
                System.out.println("productName: " + productName);
                System.out.println("UnitPrice: " + unitPrice);
                System.out.println("UnitsInStock: " + unitsInStock);
            }
            results.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
