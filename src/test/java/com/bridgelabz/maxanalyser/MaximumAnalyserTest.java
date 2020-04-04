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

    @Test
    public void givenThreeIntegers_findMax_atSecondPosition() {
        Integer maximum=maximumAnalyser.findMaximum(10,20,30);
        Assert.assertEquals((Integer)30,maximum);
    }

    @Test
    public void givenThreeIntegers_findMax_atThirdPosition() {
        Integer maximum =maximumAnalyser.findMaximum(10,20,30);
        Assert.assertEquals((Integer)30,maximum);
    }

    @Test
    public void givenThreeFloat_findMax_atFirstPosition() {
        Float maximum=maximumAnalyser.findMaximum(10.1f,20.2f,30.3f);
        Assert.assertEquals((Float)30.3f,maximum);
    }

    @Test
    public void givenThreeFloat_findMax_atSecondPosition(){
        Float maximum =maximumAnalyser.findMaximum(10.1f,20.2f,30.3f);
        Assert.assertEquals((Float)30.3f,maximum);
    }

    @Test
    public void givenThreeFloat_findMax_atThirdPosition() {
        Float maximum=maximumAnalyser.findMaximum(10.1f,20.2f,30.3f);
        Assert.assertEquals((Float)30.3f,maximum);
    }

    @Test
    public void givenThreeString_findMax_atFirstPosition(){
        String maximum=maximumAnalyser.findMaximum("BridgeLabz","Capgiminai","Accenture");
        Assert.assertEquals((String) "Capgiminai",maximum);
    }

    @Test
    public void givenThreeString_findMax_atSecondPosition(){
        String maximum=maximumAnalyser.findMaximum("BridgeLabz","Capgiminai","Accenture");
        Assert.assertEquals((String) "Capgiminai",maximum);
    }

    @Test
    public void givenThreeString_findMax_atThirdPosition(){
        String maximum=maximumAnalyser.findMaximum("BridgeLabz","Capgiminai","Accenture");
        Assert.assertEquals((String) "Capgiminai",maximum);
    }
}

