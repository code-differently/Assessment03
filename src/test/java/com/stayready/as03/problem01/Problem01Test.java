package com.stayready.as03.problem01;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class  Problem01Test {

    private Problem01 weird;

    @Before
    public void setup(){
        weird = new Problem01();
    }

    @Test
    public void weirdSolutionTest(){
        String expected = "Weird";
        String actual = weird.isThisWeird(3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void notWeirdSolutionTest(){
        String expected = "Not Weird";
        String actual = weird.isThisWeird(24);
        Assert.assertEquals(expected, actual);
    }
}
