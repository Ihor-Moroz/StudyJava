package ua.ihor.first;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
    @Test
    public void add() throws Exception {
        Calculate test=new Calculate();
        test.add(1,1);
        assertEquals(2,test.getResult(),0);
    }

    @Test
    public void subtract() throws Exception {
        Calculate test=new Calculate();
        test.subtract(8,4);
        assertEquals(4,test.getResult(),0);
    }

    @Test
    public void multiply() throws Exception {
        Calculate test=new Calculate();
        test.multiply(2,4);
        assertEquals(8,test.getResult(),0);
    }

    @Test(expected = UserException.class)
    public void separateException() throws UserException{
        Calculate test=new Calculate();
        test.separate();
    }

    @Test
    public void separate() throws UserException{
        Calculate test=new Calculate();
        test.separate(16,4);
        assertEquals(4,test.getResult(),0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void separateRuntimeException() throws UserException{
        Calculate test=new Calculate();
        test.separate(1,0);
    }
}