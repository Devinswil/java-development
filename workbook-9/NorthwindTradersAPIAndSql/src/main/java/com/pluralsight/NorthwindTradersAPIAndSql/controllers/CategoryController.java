package com.pluralsight.NorthwindTradersAPIAndSql.controllers;

import com.pluralsight.NorthwindTradersAPIAndSql.dao.interfaces.ICategoryDao;
import com.pluralsight.NorthwindTradersAPIAndSql.models.Category;
import com.pluralsight.NorthwindTradersAPIAndSql.dao.impl.JdbcProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {
private ICategoryDao dao;
    @Autowired
    public CategoryController(ICategoryDao dao) {
        this.dao = dao;
    }

    @RequestMapping(path = "/categories", method = RequestMethod.GET)
    public List<Category> getProducts() {
        return dao.getAll();
    }

    @RequestMapping(path = "/categories/{categoryId}", method = RequestMethod.GET)
    public Category getByCategoryId(@PathVariable int categoryId) {
        return dao.getById(categoryId);
    }
}