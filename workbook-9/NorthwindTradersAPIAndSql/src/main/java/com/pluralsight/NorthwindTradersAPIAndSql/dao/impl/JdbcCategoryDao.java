package com.pluralsight.NorthwindTradersAPIAndSql.dao.impl;

import com.pluralsight.NorthwindTradersAPIAndSql.dao.interfaces.ICategoryDao;
import com.pluralsight.NorthwindTradersAPIAndSql.models.Category;
import com.pluralsight.NorthwindTradersAPIAndSql.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
@Component
public class JdbcCategoryDao implements ICategoryDao {

    private final DataSource dataSource;

    @Autowired
    public JdbcCategoryDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    @Override
    public List<Category> getAll() {
        List<Category> categories = new ArrayList<>();
        String sql = "SELECT * FROM categories";

        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                int categoryID = resultSet.getInt(1);
                String categoryName = resultSet.getString(2);
                Category category = new Category(categoryID,categoryName);
                categories.add(category);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return categories;
    }


    @Override
    public Category getById(int categoryId) {
        String sql = "SELECT * FROM categories WHERE CategoryID = ?";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, categoryId);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    int categoryID = resultSet.getInt(1);
                    String categoryName = resultSet.getString(2);
                    Category category = new Category(categoryID,categoryName);
                    return category;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
