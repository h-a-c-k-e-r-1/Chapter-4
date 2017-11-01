

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class AccountTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AccountTest
{
    
    public void testOne()
    {
        Account account1 = new Account(100, "Dan", 12345);
        assertEquals(100,account1.getBalance(),0.1);
        account1.chargeFee();
        assertEquals(90,account1.getBalance(),0.1);
        account1.deposit(20);
        assertEquals(110,account1.getBalance(),0.1);
    }
}
