package com.shop.product;

public class Product {
    private int id;
    private double price;
    
    /**
     * @param id    an unique (not forced!) identifier for product 
     * @param price a price for the product 
     */
    public Product(int id, double price) {
        this.id = id;
        this.price = price;
    }
    
    public int getId() {
        return id;
    }
    
    public double getPrice() {
        return price;
    }    
}
