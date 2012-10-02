package shopping;

/**
 * @author Fartin Mowler, THE MOST AWESOME CODER (in the world)
 */
public class Shop {
    
    Double[] all = new Double[3000]; // This will be the products. Make sure there is plenty of space for them.
    
    public Shop() {
        
        /*************************************
         * All of the products to the array. *
         *************************************/ 

        // We don't want null pointer exceptions, so put default values into array (clever me).
        for(int i = 0; i < 3000; i++) {
            all[i] = 0.00; // If a product does not exist, it's price is 0.00.
        }

                    
                    // Add a price to an ID, i.e. a product.
                            all[1000]      = 1.00;
                            all[1001]    = 100.00;
                            all[1002]      = 1.00;
                            all[1003]      = 0.99;
                            all[1100]     = 20.99;
                            all[1200]      = 3.30;
                            all[2000]      = 5.50;
                            all[2001]     = 99.00;
    }
    
    /*                _.-----.._                           
                    -'    .     ``:--.                     
                  .'.         '  '    \,     I like manatees. 
                 /       .    `  .  (* \              
                : .  `.  :  ,)  .::../  k    (artwork by Fartin)              
               ) ..aaa8Y88aP/ <d888aaL_::)                 
             .'a888Y8888888b\  )  `^88: "                  
           .'.a8888)  """"   `'    d88                     
          (a888888/                "`                      
          `Y888P*/
    /******************************************            
     * Function: do_it                        *             
     * Author:   You know who!                *            
     *  ______________________                *            
     * | DO NOT TOUCH!!!11one |               ********            
     * Change only if you know what you are doing!!! *            
     *                                               ************************************
     * This function will calculate the total price of the products given. The cashier  *
     * will give the ID's of the products, which will be passed to this function.       *
     * Then we will get the prices of the individual products, sum them and             *
     * return the total sum.                                                            *
     *                                                                                  *
     * Parameters:                                                                      *
     *   ids: identifiers for the products                                              *
     * Returns:                                                                         *
     *   the total price of products                                                    *
     ************************************************************************************/
    public double do_it(int[] ids) {
        
        System.out.println("DEBUG (Hello from Fartin): " + ids.length); // For debugging purposes.
        
        //First, we will search if cashier has made a typo with a product identifier.
        boolean found = true;
        for (int i = 0; i < ids.length; i++) {
            for (int j = 0; j < 3000; j++)
                if (j == ids[i] && all[j] == 0.00) {
                    found = false; break;
                }
        }
        
        // We will go back if product is not found.
      if (found == true) {
          // Continue if products are actually found.
        } else { 
            return -1.0; // So we will return -1 if error is found.
        }
        
        
      // If the given products exist, we then calculate the total sum.
      double lol = 0.00;
      
      //Go through the given products again.
        for (int i = 0; i < ids.length; i++) 
        {
          if(all[ids[i]] != 0.00) { // Doublecheck the product ids, just in case.
                double a = all[ids[i]]; // Get the price.
                lol = lol + a;          // Add the price to the total lol. Err, to the total sum.
              
          }
        }
        
        
        return lol; // All done! Return the sum.
    }
    
}
