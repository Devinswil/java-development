package com.pluralsight.NorthwindTradersSpringBootCommandLine.dao.interfaces;

import com.pluralsight.NorthwindTradersSpringBootCommandLine.models.Product;

import java.util.List;

public interface IProductDAO {

    Product add(Product product);

    List<Product> getAllTransaction();

    Product getProductById(int productId);

    void update(int productId, Product product);

    void delete(int productId);
}
