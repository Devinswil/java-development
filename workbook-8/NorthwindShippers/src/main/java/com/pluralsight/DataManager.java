package com.pluralsight;

import Models.Shippers;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private DataSource dataSource;

    public DataManager(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void getNewUserData(String companyName, String phone) {
        try (Connection connection = dataSource.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement("insert into CompanyName,Phone) values (?),(?)", Statement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setString(1, companyName);
            preparedStatement.setString(2, phone);
           preparedStatement.executeUpdate();

            try (ResultSet keys = preparedStatement.getGeneratedKeys()) {
                while (keys.next()) {
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Shippers> displayShippers() {
        List<Shippers> shippers = new ArrayList<>();

        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM shippers")) {
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    int shipperID = resultSet.getInt(1);
                    String companyName = resultSet.getString(2);
                    String phone = resultSet.getString(3);

                    Shippers shipper = new Shippers(shipperID, companyName, phone);
                    shippers.add(shipper);
                  //  shippers.forEach(System.out::println);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return shippers;
    }

    public void changeShipperPhoneNumber(int shipperID, String phone) {
        try (Connection connection = dataSource.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement("Update shippers SET Phone=? WHERE shipperID=?", Statement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setString(1, phone);
            preparedStatement.setInt(2, shipperID);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteShipper(int shipperID) {
        try (Connection connection = dataSource.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM shippers WHERE shipperID=?")) {
            preparedStatement.setInt(1, shipperID);
            preparedStatement.executeUpdate();
            //int rows = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

