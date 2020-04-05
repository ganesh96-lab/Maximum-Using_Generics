package com.bridgelabz.maxanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MaximumAnalyserTest
{

    MaximumAnalyser maximumAnalyser=new MaximumAnalyser();
    @Test
    public void givenThreeIntegers_findMax_atFirstPosition() {

        Comparable maximum=maximumAnalyser.findMaximum(10,20,30);
        Assert.assertEquals(30,maximum);
    }

    @Test
    public void givenThreeIntegers_findMax_atSecondPosition() {
        Comparable maximum=maximumAnalyser.findMaximum(10,20,30);
        Assert.assertEquals(30,maximum);
    }

    @Test
    public void givenThreeIntegers_findMax_atThirdPosition() {
        Comparable maximum =maximumAnalyser.findMaximum(10,20,30);
        Assert.assertEquals(30,maximum);
    }

    @Test
    public void givenThreeFloat_findMax_atFirstPosition() {
        Comparable maximum=maximumAnalyser.findMaximum(10.1f,20.2f,30.3f);
        Assert.assertEquals(30.3f,maximum);
    }

    @Test
    public void givenThreeFloat_findMax_atSecondPosition(){
        Comparable maximum =maximumAnalyser.findMaximum(10.1f,20.2f,30.3f);
        Assert.assertEquals((Float)30.3f,maximum);
    }

    @Test
    public void givenThreeFloat_findMax_atThirdPosition() {
        Comparable maximum=maximumAnalyser.findMaximum(10.1f,20.2f,30.3f);
        Assert.assertEquals((Float)30.3f,maximum);
    }

    @Test
    public void givenThreeString_findMax_atFirstPosition(){
        Comparable maximum=maximumAnalyser.findMaximum("BridgeLabz","Capgiminai","Accenture");
        Assert.assertEquals("Capgiminai",maximum);
    }

    @Test
    public void givenThreeString_findMax_atSecondPosition(){
        Comparable maximum=maximumAnalyser.findMaximum("BridgeLabz","Capgiminai","Accenture");
        Assert.assertEquals((String) "Capgiminai",maximum);
    }

    @Test
    public void givenThreeString_findMax_atThirdPosition(){
        Comparable maximum=maximumAnalyser.findMaximum("BridgeLabz","Capgiminai","Accenture");
        Assert.assertEquals((String) "Capgiminai",maximum);
    }
}
