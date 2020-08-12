package com.stayready.as03.problem01;

import com.stayready.as03.problem00.Problem00;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem01Test {

    @Test
    public void isWeird_v1_Test1(){ // testing odd numbers
        String expected = "Weird";
        String actual = Problem01.isWeird_v1(3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isWeird_v1_Test2(){ // testing even numbers anywhere from 2 to 5
        String expected = "Not Weird";
        String actual = Problem01.isWeird_v1(4);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isWeird_v1_Test3(){ // testing even numbers anywhere from 6 to 20
        String expected = "Weird";
        String actual = Problem01.isWeird_v1(14);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isWeird_v1_Test4(){ // testing even numbers greater than 20
        String expected = "Not Weird";
        String actual = Problem01.isWeird_v1(24);
        Assert.assertEquals(expected, actual);
    }
}
