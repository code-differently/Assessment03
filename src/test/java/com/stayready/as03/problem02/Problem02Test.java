package com.stayready.as03.problem02;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem02Test {

    @Test
    public void findNumberOfNonMatchingSetsTest1(){
        Integer[] input = {10,20,20,10,10,30,50,10,20};
        int expected = 3;
        int actual = Problem02.findNumberOfNonMatching(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findNumberOfNonMatchingSetsTest2(){
        Integer[] input = { 1, 2, 2, 3, 1, 1, 3, 4, 5 };
        int expected = 3;
        int actual = Problem02.findNumberOfNonMatching(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findNumberOfNonMatchingSetsTest3(){
        Integer[] input = {};
        int expected = 0;
        int actual = Problem02.findNumberOfNonMatching(input);
        Assert.assertEquals(expected, actual);
    }
}
