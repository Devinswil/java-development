package com.pluralsight.NorthwindTradersAPIAndSql.controllers;

import com.pluralsight.NorthwindTradersAPIAndSql.models.Product;
import com.pluralsight.NorthwindTradersAPIAndSql.dao.impl.JdbcProductDao;
import com.pluralsight.NorthwindTradersAPIAndSql.dao.interfaces.IProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    private IProductDao dao;
@Autowired
    public ProductController(IProductDao dao) {
        this.dao = dao;
    }

    @RequestMapping(path = "/products", method = RequestMethod.GET)
    public List<Product> getProducts() {
        return (dao.getAll());
    }

    @RequestMapping(path = "/products/{productId}", method = RequestMethod.GET)
    public Product getByProductId(@PathVariable int productId) {
   return dao.getById(productId);
    }
}
