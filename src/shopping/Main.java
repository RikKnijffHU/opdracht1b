package shopping;

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
        Shop shop = new Shop();
        
        int[] a = {1000, 1001, 2000};
        int[] b = {1002, 2001};
        int[] c = {999};
        
        System.out.println("A) Pitäisi tulostaa 106.50 == " + shop.do_it(a));
        System.out.println("B) Pitäisi tulostaa 100.00 == " + shop.do_it(b));
        System.out.println("C) Pitäisi tulostaa   -1.0 == " + shop.do_it(c));
    }
}
