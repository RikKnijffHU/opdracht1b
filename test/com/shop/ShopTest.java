package com.shop;

import com.shop.Shop;
import com.shop.product.ProductRepository;
import com.shop.product.ProductNotFoundException;
import com.shop.price.PriceService;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ShopTest {
    
    private Shop target = null;
    private double delta = 0.00;
    
    @Before
    public void setUp() {
        target = new Shop(new ProductRepository(), new PriceService());
    }

    @Test(expected = ProductNotFoundException.class)
    public void shouldThrowExceptionOneIfEvenOneOfTheProductsIsNotFound() throws ProductNotFoundException {
        int[] ids = {9999, 2358, 1000};
        
        target.calculateTotalPrice(ids);
    }
    
    @Test
    public void shouldNotThrowExceptionIfProductsAreFound() {
        int[] ids = {1000};
        
        try { 
            target.calculateTotalPrice(ids);
        } catch (Exception e) {
            fail("Should not throw exception if products are found");
        }
    }
    
    @Test
    public void shouldSumPriceOfProducts() throws ProductNotFoundException {
        int[] ids = {1000, 1001, 2000};
            
        assertEquals(
            1.00 + 100.00 + 5.50,
            target.calculateTotalPrice(ids),
            delta
        );
    }
}
