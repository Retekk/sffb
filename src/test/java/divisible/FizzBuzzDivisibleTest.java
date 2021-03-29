package divisible;

import com.r.sffb.divisible.FizzBuzzDivisible;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class FizzBuzzDivisibleTest {

    public FizzBuzzDivisible testFizzBuzzDivisible = null;

    @BeforeEach
    public void setUp() {
        testFizzBuzzDivisible = new FizzBuzzDivisible(3, "testString");
    }

    @Test
    void testFizzBuzzDivisibleConstructorWithZeroDenominator() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new FizzBuzzDivisible(0, "zeroDenominator"));
    }

    @Test
    void testModuloReturnZeroTrue() {
        assumeTrue(testFizzBuzzDivisible.moduloReturnZero(3));
    }

    @Test
    void testModuloReturnZeroFalse() {
        assumeFalse(testFizzBuzzDivisible.moduloReturnZero(2));
    }

    @Test
    void testGetValue() {
        assertEquals(testFizzBuzzDivisible.getValue(), "testString");
    }

}
