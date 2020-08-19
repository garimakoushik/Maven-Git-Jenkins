package myTests;

import org.junit.Assert;
import org.junit.Test;

public class Palindrome {

    @Test
    public void verifyStringIsPalindrome() {
        String expctedResult="ABA";
        String actualResult=isPalString(expctedResult);
        Assert.assertEquals(expctedResult,actualResult);
    }

    @Test
    public void verifyNumberIsPalindrome() {
        int expectedResult=121;
        int actualResult=isNumPal(expectedResult);
        Assert.assertEquals(expectedResult,actualResult);
    }
    public String isPalString(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        StringBuilder reverse = sb.reverse();
        return reverse.toString();
    }
    public int isNumPal(int n){
        int remainder = 0;
        int pal= 0;
        int original = n;
        while (n != 0){
            remainder = n % 10;
            pal = pal * 10 + remainder;
            n /=10;
        }
        return pal;
    }
}
