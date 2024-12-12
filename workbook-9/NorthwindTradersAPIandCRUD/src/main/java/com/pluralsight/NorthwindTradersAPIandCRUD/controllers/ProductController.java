package com.pluralsight.NorthwindTradersAPIandCRUD.controllers;

import com.pluralsight.NorthwindTradersAPIandCRUD.dao.interfaces.IProductDao;
import com.pluralsight.NorthwindTradersAPIandCRUD.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(path = "/products", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Product insertProduct(@RequestBody Product product) {
        return dao.insert(product);
    }

    @RequestMapping(path = "/products/{productId}", method = RequestMethod.PUT)
    public void updateProduct(@PathVariable int productId,@RequestBody Product product) {
       dao.update(productId,product);
    }
    @RequestMapping(path = "/products/{productId}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteProduct(@PathVariable int productId) {
        dao.delete(productId);
    }

}
