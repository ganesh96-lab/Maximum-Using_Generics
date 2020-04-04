package com.bridgelabz.maxanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MaximumAnalyserTest
{
    MaximumAnalyser maximumAnalyser=new MaximumAnalyser();

    @Test
    public void givenThreeIntegers_findMax_atFirstPosition() {
        Integer maximum=maximumAnalyser.findMaximum(10,20,30);
        Assert.assertEquals((Integer)30,maximum);
    }

}
