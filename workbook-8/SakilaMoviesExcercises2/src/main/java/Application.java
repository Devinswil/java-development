import org.apache.commons.dbcp2.BasicDataSource;

import java.awt.desktop.SystemEventListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.exit(1);
        }
        String username = args[0];
        String password = args[1];
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/sakila");
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the last name of the actor");
        String answer = scanner.nextLine();


    }

    private static void displayLastName(BasicDataSource dataSource) {
        try {
            try (Connection connection = dataSource.getConnection());
            PreparedStatement statement = connection.prepareStatement
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
