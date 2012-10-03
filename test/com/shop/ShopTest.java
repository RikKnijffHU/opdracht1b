package com.shop;

import com.shop.Shop;
import com.shop.product.ProductNotFoundException;
import org.junit.Before;
import org.junit.Test;
import org.junit.internal.runners.statements.ExpectException;
import shopping.ProductNotFoundException;
import shopping.Shop;
import static org.junit.Assert.*;

public class ShopTest {
    
    private Shop target = null;
    private double delta = 0.00;
    
    @Before
    public void setUp() {
        target = new Shop();
    }

    @Test(expected = ProductNotFoundException.class)
    public void shouldThrowExceptionOneIfEvenOneOfTheProductsIsNotFound() {
        int[] ids = {9999, 2358, 1000};
        
        try { 
            target.calculateTotalPrice(ids);
        } catch (Exception e) {}
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
    public void shouldSumPriceOfProducts() {
        int[] ids = {1000, 1001, 2000};
                
        try { 
            assertEquals(
                1.00 + 100.00 + 5.50,
                target.calculateTotalPrice(ids),
                delta
            );
        } catch (Exception e) {}
    }
}
