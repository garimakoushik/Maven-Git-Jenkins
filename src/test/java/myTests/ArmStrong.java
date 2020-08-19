package myTests;

import org.junit.Assert;
import org.junit.Test;

public class ArmStrong {

    @Test
    public void verifyTrue() {
        boolean expctedResult=true;
        boolean actualResult=true;
        Assert.assertEquals(expctedResult,actualResult);
    }

    @Test
    public void verifyNumberIsArmstrongOrNot() {
        int n= 153;
        int rec = withRec(n,0);
        Assert.assertEquals(rec,n);
    }

    public static int withRec(int n, int reverse){
        int remainder = 0 ;
        while (n!=0){
            remainder = n %10;
            reverse += Math.pow(remainder,3);
            n /=10;
            return withRec(n,reverse);
        }
        return reverse;
    }
}
