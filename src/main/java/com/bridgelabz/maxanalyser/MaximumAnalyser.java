package com.bridgelabz.maxanalyser;

public class MaximumAnalyser <T extends Comparable>{

    public T findMaximum(T firstNumber,T secondNumber,T thirdNumber) {
        if (firstNumber.compareTo(secondNumber) >= 0 && firstNumber.compareTo(thirdNumber) >= 0) {
            return firstNumber;
        }
        else if (secondNumber.compareTo(firstNumber) >= 0 && secondNumber.compareTo(thirdNumber) >= 0) {
            return secondNumber;
        }
        else {
            return thirdNumber;
        }
    }

}
