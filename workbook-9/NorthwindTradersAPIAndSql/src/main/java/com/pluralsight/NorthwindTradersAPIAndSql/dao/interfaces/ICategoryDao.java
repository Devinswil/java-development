package com.pluralsight.NorthwindTradersAPIAndSql.dao.interfaces;

import com.pluralsight.NorthwindTradersAPIAndSql.models.Category;

import java.util.List;

public interface ICategoryDao {
    List<Category>getAll();
    Category getById(int categoryId);
}
