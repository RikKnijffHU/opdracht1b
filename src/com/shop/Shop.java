package com.shop;

import java.util.ArrayList;
import com.shop.product.Product;
import com.shop.product.ProductNotFoundException;
import com.shop.product.ProductRepository;

/**
 * @author Fartin Mowler, THE MOST AWESOME CODER (in the world)
 */
public class Shop {
    
    private ProductRepository productRepository;
    
    public Shop(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    
    /**
     * @param int[] ids Id of the products
     * @return double Total price of the given products
     * @throws ProductNotFoundException
     */
    public double calculateTotalPrice(int[] ids) throws ProductNotFoundException {
        ArrayList<Product> products = productRepository.findAll();
        
        if (products.isEmpty()) {
            throw new ProductNotFoundException();
        }
        
        // double totalPrice = PriceService.calculateTotal(products);
        
        return totalPrice; // All done! Return the sum.
    }
    
}
