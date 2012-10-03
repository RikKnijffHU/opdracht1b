package com.shop.price;

import com.shop.product.Product;
import java.util.ArrayList;

public class PriceService {
    
    public double calculateTotal(ArrayList<Product> products) {
        double totalPrice = 0.00;
        
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        
        return totalPrice;
    }
}
