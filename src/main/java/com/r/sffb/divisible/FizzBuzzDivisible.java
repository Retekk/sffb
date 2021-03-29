package com.r.sffb.divisible;

public class FizzBuzzDivisible implements Divisible {

    final private int denominator;

    final private String textToReturn;

    public FizzBuzzDivisible(int denominator, String textToReturn) {
        if (denominator == 0)
            throw new IllegalArgumentException("Denominator cannot be 0");
        this.denominator = denominator;
        this.textToReturn = textToReturn;
    }

    @Override
    public boolean moduloReturnZero(int numerator) {
        return numerator % denominator == 0;
    }

    @Override
    public String getValue() {
        return textToReturn;
    }
}
