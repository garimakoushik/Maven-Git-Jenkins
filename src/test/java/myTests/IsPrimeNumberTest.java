package myTests;
import garima.*;
import java.util.*;


import org.junit.Assert;
import org.junit.Test;

public class IsPrimeNumberTest {

    IsPrimeNumber obj = new IsPrimeNumber();
    @Test
    public void testIsPrimeNumber(){
        boolean expectedResult = true;
        boolean actualResult = obj.isPrime(11);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsNotPrimeNumber(){
        boolean expectedResult = false;
        boolean actualResult = obj.isPrime(14);
        Assert.assertEquals(expectedResult, actualResult);
    }
}
