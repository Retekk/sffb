package com.r.sffb;

import com.r.sffb.divisible.Divisible;
import com.r.sffb.divisible.FizzBuzzDivisible;

import static com.r.sffb.AppConstants.*;

public class FizzBuzz {

    private final Divisible modThree = new FizzBuzzDivisible(3, "Fizz");
    private final Divisible modFive = new FizzBuzzDivisible(5, "Buzz");
    private final Divisible modFifteen = new FizzBuzzDivisible(15, "FizzBuzz");

    private final int START;
    private final int END;

    public FizzBuzz(int START, int END) throws IllegalArgumentException {
        if (START < MIN_RANGE_LIMIT || START > END || END > MAX_RANGE_LIMIT)
            throw new IllegalArgumentException("Range should be between 0 and 10000 and start has to be smaller than end");
        this.START = START;
        this.END = END;
    }

    public void run() {
        for (int i = START; i <= END; i++) {
            printResult(i);
        }
    }

    private void printResult(int currentNumber) {
        if (modFifteen.moduloReturnZero(currentNumber)) {
            System.out.println(modFifteen.getValue());
        } else if (modThree.moduloReturnZero(currentNumber)) {
            System.out.println(modThree.getValue());
        } else if (modFive.moduloReturnZero(currentNumber)) {
            System.out.println(modFive.getValue());
        } else {
            System.out.println(currentNumber);
        }
    }
}
