import org.apache.commons.dbcp2.BasicDataSource;

import java.awt.desktop.SystemEventListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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




            try (Connection connection = dataSource.getConnection()) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("What is the last name of the actor");
                String answer = scanner.nextLine();
                String actorsQuery = "SELECT first_name, last_name FROM actor WHERE last_name = ?";
                try (PreparedStatement actorsStatement = connection.prepareStatement(actorsQuery)) {
                    actorsStatement.setString(1, answer);

                    try (ResultSet actorsResult = actorsStatement.executeQuery()) {
                        if (actorsResult.next()) {
                            System.out.println("Your matches are: \n");
                            do {
                                String firstName = actorsResult.getString("first_name");
                                answer = actorsResult.getString("last_name");
                                System.out.println(firstName + " " + answer);
                            } while (actorsResult.next());

                        } else {
                            System.out.println("No matches!");
                        }
                    }
                }


                System.out.print("Enter the first name of an actor: ");
                String firstName = scanner.nextLine();
                System.out.print("Enter the last name of an actor: ");
                answer = scanner.nextLine();

                // Execute query to retrieve films the actor has been in
                String filmsQuery = "SELECT title FROM film f JOIN film_actor fa ON f.film_id = fa.film_id " +
                        "JOIN actor a ON fa.actor_id = a.actor_id " +
                        "WHERE a.first_name = ? AND a.last_name = ?";
                try (PreparedStatement filmsStatement = connection.prepareStatement(filmsQuery)) {
                    filmsStatement.setString(1, firstName);
                    filmsStatement.setString(2, answer);

                    try (ResultSet filmsResult = filmsStatement.executeQuery()) {
                        if (filmsResult.next()) {
                            System.out.println("The films the actor has been in: ");
                            do {
                                String filmTitle = filmsResult.getString("title");
                                System.out.println(filmTitle);
                            } while (filmsResult.next());
                        } else {
                            System.out.println("No films found for the actor!");
                        }
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }
}