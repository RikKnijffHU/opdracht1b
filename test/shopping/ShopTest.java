package shopping;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ShopTest {
    
    private Shop target = null;
    private double delta = 0.00;
    
    @Before
    public void setUp() {
        target = new Shop();
    }

    @Test
    public void shouldReturnMinusOneIfEvenOneOfTheProductsIsNotFound() {
        int[] ids = {9999, 2358, 1000};
        
        assertEquals(-1, target.do_it(ids), delta);
    }
    
    @Test
    public void shouldNotReturnMinusOneIfProductsAreFound() {
        int[] ids = {1000};
        
        assertTrue(target.do_it(ids) != -1.0);
    }
    
    @Test
    public void shouldSumPriceOfProducts() {
        int[] ids = {1000, 1001, 2000};
        
        assertEquals(
            1.00 + 100.00 + 5.50,
            target.do_it(ids),
            delta
        );
    }
}
