package com.stayready.as03.problem03;

//import com.stayready.as03.problem03.Problem03;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem03Test {
    Problem03 solution;

    @Before
    public void setup(){
        solution = new Problem03();
    }

    @Test
    public void isPalindromeTest1(){
        String input = "aaabbbb";
        String expected = "YES";
        String actual = solution.isPalindrome(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isPalindromeTest2(){
        String input = "cdefghmnopqrstuvw";
        String expected = "NO";
        String actual = solution.isPalindrome(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isPalindromeTest3(){
        String input = "cdcdcdcdeeeef";
        String expected = "YES";
        String actual = solution.isPalindrome(input);
        Assert.assertEquals(expected, actual);
    }
}
