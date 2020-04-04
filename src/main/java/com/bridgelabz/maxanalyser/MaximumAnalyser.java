package com.bridgelabz.maxanalyser;

public class MaximumAnalyser {
    public Integer findMaximum(Integer firstNumber,Integer secondNumber,Integer thirdNumber) {
        if (firstNumber.compareTo(secondNumber) > 0 && firstNumber.compareTo(thirdNumber) > 0) {
            return firstNumber;
        }
        else if (secondNumber.compareTo(firstNumber) > 0 && secondNumber.compareTo(thirdNumber) > 0) {
            return secondNumber;
        }
        else {
            return thirdNumber;
        }
    }

    public Float findMaximum(Float firstNumber,Float secondNumber,Float thirdNumber) {
        if (firstNumber.compareTo(secondNumber) > 0 && firstNumber.compareTo(thirdNumber) > 0) {
            return firstNumber;
        } else if (secondNumber.compareTo(firstNumber) > 0 && secondNumber.compareTo(thirdNumber) > 0) {
            return secondNumber;
        } else {
            return thirdNumber;
        }
    }
}
