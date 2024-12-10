package com.pluralsight.NorthwindTradersAPI.controllers;

import com.pluralsight.NorthwindTradersAPI.models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    private List<Product> products;

    public ProductController() {
        products = new ArrayList<>();
        products.add(new Product(1, "Product A", 101, 10.50));
        products.add(new Product(2, "Product B", 102, 20.75));
        products.add(new Product(3, "Product C", 103, 15.30));
        products.add(new Product(4, "Product D", 104, 12.99));
        products.add(new Product(5, "Product E", 105, 8.45));
    }

    @RequestMapping(path = "/products", method = RequestMethod.GET)
    public List<Product> getProducts() {
        return products;
    }

    @RequestMapping(path = "/products/{productId}", method = RequestMethod.GET)
    public Product getByProductId(@PathVariable int productId) {
        for (Product product : products) {
            if (product.getProductId() == productId) {
                return product;
            }

        }
        return null;
    }
}
