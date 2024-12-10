package com.pluralsight.NorthwindTradersAPI.controllers;

import com.pluralsight.NorthwindTradersAPI.models.Category;
import com.pluralsight.NorthwindTradersAPI.models.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class CategoryController {
    private List<Category> categorylist;

    public CategoryController(){
        categorylist.add(new Category(1, "Beverages"));
        categorylist.add(new Category(2, "Condiments"));
        categorylist.add(new Category(3, "Dairy Products"));
        categorylist.add(new Category(4, "Seafood"));
        categorylist.add(new Category(5, "Confections"));

    }
    @RequestMapping(path = "/category", method = RequestMethod.GET)
    public List<Category> getProducts() {
        return categorylist;
    }

    @RequestMapping(path= "/category/{categoryId}",method = RequestMethod.GET)
    public Category getByCategoryId(@PathVariable int categoryId) {
        for (Category category : categorylist) {
            if (category.getCategoryId() == categoryId) {
                return category;
            }
        }
        return null;
    }
}