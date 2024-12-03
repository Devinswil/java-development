package com.pluralsight;

import models.Actor;
import models.Film;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private DataSource dataSource;

    public DataManager(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    public  List<Actor> getActorWithLastName(String lastName){
        List<Actor>actors= new ArrayList<>();
        String actorsQuery = "SELECT actor_id,first_name, last_name FROM actor WHERE last_name = ?";


        try (Connection connection = dataSource.getConnection();
                PreparedStatement actorsStatement = connection.prepareStatement(actorsQuery)) {
            actorsStatement.setString(1, lastName);

            try (ResultSet actorsResult = actorsStatement.executeQuery()) {
                if (actorsResult.next()) {
                    do {
                        int actorID = actorsResult.getInt("actorID");
                        String firstName = actorsResult.getString("first_name");
                        lastName = actorsResult.getString("last_name");
                        Actor actor = new Actor(actorID,firstName,lastName);
                        actors.add(actor);
                    } while (actorsResult.next());

                } else {
                    System.out.println("No matches!");
                }
            }
        } catch (SQLException e) {
           e.printStackTrace();
        }
        return actors;
    }
    public List<Film> getAllFilmsMadeBy(int actorID){
        List<Film>films= new ArrayList<>();
        String filmsQuery = "SELECT title FROM film f JOIN film_actor fa ON f.film_id = fa.film_id " +
                "JOIN actor a ON fa.actor_id = a.actor_id " +
                "WHERE a.first_name = ? AND a.last_name = ?";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement filmsStatement = connection.prepareStatement("SELECT film.film.id,film.title,film.description,film.release_year,film.length"+"FROM film"+"JOIN" )) {
            filmsStatement.setString(1, firstName);
            filmsStatement.setString(2, lastName);

            try(ResultSet filmResult = filmsStatement.executeQuery()){
            if (filmResult.next())
                do {
                    String filmTitle = filmResult.getString("title");
                } while (filmResult.next());
                }
        }

    } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
