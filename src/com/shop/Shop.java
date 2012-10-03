package com.shop;

import com.shop.product.Product;
import com.shop.product.ProductNotFoundException;
import com.shop.product.ProductRepository;
import com.shop.price.PriceService;
import java.util.ArrayList;

/**
 * @author Fartin Mowler, THE MOST AWESOME CODER (in the world)
 */
public class Shop {
    private ProductRepository productRepository;
    private PriceService priceService;
    
    public Shop(ProductRepository productRepository, PriceService priceService) {
        this.productRepository = productRepository;
        this.priceService = priceService;
    }
    
    /**
     * @param int[] ids Id of the products
     * @return double Total price of the given products
     * @throws ProductNotFoundException
     */
    public double calculateTotalPrice(int[] ids) throws ProductNotFoundException {
        ArrayList<Product> products = productRepository.findByIds(ids);
        
        System.out.println(ids.length);
        System.out.println(products.size());
        
        if (products.size() != ids.length) {
            throw new ProductNotFoundException();
        }
        
        return priceService.calculateTotal(products);
    }
    
}
