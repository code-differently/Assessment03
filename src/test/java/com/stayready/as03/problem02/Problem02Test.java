package com.stayready.as03.problem02;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem02Test {

    private Problem02 problem02;

    @Before
    public void setUp(){
        this.problem02 = new Problem02();
    }

    @Test
    public void findNumberOfNonMatchingSetsTest1(){
        int[] input = {10,20,20,10,10,30,50,10,20};
        int expected = 3;
        int actual = problem02.findNumberOfNonMatching(input);
        Assert.assertEquals(expected, actual);
        System.out.println(actual);
    }
}
