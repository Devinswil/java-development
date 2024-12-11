package com.pluralsight.NorthwindTradersAPIandCRUD.dao.interfaces;

import com.pluralsight.NorthwindTradersAPIandCRUD.models.Category;

import java.util.List;

public interface ICategoryDao {
    List<Category>getAll();
    Category getById(int categoryId);
    Category insert(Category category);
}
