package com.shop;

import com.shop.product.ProductRepository;

/**
 * @author Fartin Mowler, Lead Software Architect, THE BEST CODER, 1996
 */
public class Main {
    
    /*******************************************************
     * Function: main                                      *
     * Author:   The magnificient Fartin Mowler!           *
     *                                                     *
     * Parameters:                                         *
     *   args: arguments given from the command line       *     
     *******************************************************/
    public static void main(String[] args) 
    {
        Shop shop = new Shop(new ProductRepository());
        
        int[] a = {1000, 1001, 2000};
        int[] b = {1002, 2001};
        int[] c = {999};
        
        try { 
            System.out.println("A) Pitäisi tulostaa 106.50 == " + shop.calculateTotalPrice(a));
            System.out.println("B) Pitäisi tulostaa 100.00 == " + shop.calculateTotalPrice(b));            
            System.out.println("C) Pitäisi heittää virhe " + shop.calculateTotalPrice(c));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
