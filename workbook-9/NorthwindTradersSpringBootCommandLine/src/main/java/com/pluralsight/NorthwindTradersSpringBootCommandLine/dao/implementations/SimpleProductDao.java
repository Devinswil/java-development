package com.pluralsight.NorthwindTradersSpringBootCommandLine.dao.implementations;

import com.pluralsight.NorthwindTradersSpringBootCommandLine.dao.interfaces.IProductDAO;
import com.pluralsight.NorthwindTradersSpringBootCommandLine.models.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class SimpleProductDao implements IProductDAO {
    private List<Product>products=new ArrayList<>();

    public SimpleProductDao(){
        this.products = new ArrayList<>();
        products.add(new Product(2,"Cheese","food",4));
        products.add(new Product(3,"Steak","food",46));
        products.add(new Product(4,"Chips","food",3.40));
        products.add(new Product(6,"Apple","food",2));
    }
    @Override
    public Product add(Product product){
        int maxId=0;
        for (Product p: products){
            if (p.getProductId()>maxId){
                maxId = p.getProductId();
            }
        }
        product.setProductId(maxId+1);
        products.add(product);
        return product;
    }

    @Override
    public List<Product> getAllTransaction() {
        return products;
    }

    @Override
    public Product getProductById(int productId) {
        for (Product product:products){
            if (product.getProductId()==productId){
                return product;
            }
        }
        return null;
    }

    @Override
    public void update(int productId, Product product) {
        int index = getProductIndex(productId);
        if (index!=-1){
            products.set(index,product);
        }
    }

    @Override
    public void delete(int productId) {
        int index = getProductIndex(productId);
        if (index!=-1){
            products.remove(index);
        }

    }

    private int getProductIndex(int productId){
        for (int i =0; i <products.size();i++){
            if (products.get(i).getProductId()==productId){
                return  i;
            }
        }
        return -1;
    }

}
