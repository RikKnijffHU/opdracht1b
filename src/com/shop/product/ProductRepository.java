package com.shop.product;

import java.util.ArrayList;

/**
 * ProductRepositoryn tarkoitus on leikkiä tietokannan ORM-abstraktiotatasoa.
 */
public class ProductRepository {
    private ArrayList<Product> products = new ArrayList<Product>();
    
    public ProductRepository() {
        products.add(new Product(1000, 1.00));
        products.add(new Product(1001, 100.00));
        products.add(new Product(1002, 1.00));
        products.add(new Product(1003, 0.99));
        products.add(new Product(1100, 20.99));
        products.add(new Product(1200, 3.30));
        products.add(new Product(2000, 5.50));
        products.add(new Product(2001, 99.00));
    }
    
    public ArrayList<Product> findAll() {
        return products;
    }
    
    public ArrayList<Product> findByIds(int[] ids) {
        ArrayList<Product> foundProducts = new ArrayList<Product>();
        
        for (int i = 0; i < ids.length; i++) {
            Product product = findOneById(ids[i]);
            
            if (product != null) {
                foundProducts.add(product);
            }
        }
        
        return foundProducts;
    }
    
    public Product findOneById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        
        return null;
    }    
}
