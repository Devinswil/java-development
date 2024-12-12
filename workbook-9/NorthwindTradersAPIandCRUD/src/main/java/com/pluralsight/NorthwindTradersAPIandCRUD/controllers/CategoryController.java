package com.pluralsight.NorthwindTradersAPIandCRUD.controllers;

import com.pluralsight.NorthwindTradersAPIandCRUD.dao.interfaces.ICategoryDao;
import com.pluralsight.NorthwindTradersAPIandCRUD.models.Category;
import com.pluralsight.NorthwindTradersAPIandCRUD.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(path = "/categories", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Category insertCategory(@RequestBody Category category) {
        return dao.insert(category);
    }

    @RequestMapping(path = "/categories/{categoryId}", method = RequestMethod.PUT)
    public void updateCategory(@PathVariable int categoryId, @RequestBody Category category) {
        dao.update(categoryId, category);
    }

    @RequestMapping(path = "/categories/{categoryId}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteCategory(@PathVariable int categoryId) {
        dao.delete(categoryId);
    }

}