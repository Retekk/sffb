import com.r.sffb.FizzBuzz;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void testFizzBuzzConstructorWithLowerStart() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new FizzBuzz(-1, 100));
    }

    @Test
    void testFizzBuzzConstructorWithHigherEnd() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new FizzBuzz(1, 1000000));
    }

    @Test
    void testFizzBuzzConstructorWithHigherStartThenEnd() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new FizzBuzz(100, 1));
    }

    @Test
    void testFizzBuzzRunWithStart1AndEnd10() {
        FizzBuzz fizzBuzz = new FizzBuzz(1, 10);
        fizzBuzz.run();
        assertEquals("12Fizz4BuzzFizz78FizzBuzz", outputStreamCaptor.toString()
                .trim().replace(System.getProperty("line.separator"), ""));
    }

    @Test
    void testFizzBuzzRunWithStart20AndEnd40() {
        FizzBuzz fizzBuzz = new FizzBuzz(20, 40);
        fizzBuzz.run();
        assertEquals("BuzzFizz2223FizzBuzz26Fizz2829FizzBuzz3132Fizz34BuzzFizz3738FizzBuzz", outputStreamCaptor.toString()
                .trim().replace(System.getProperty("line.separator"), ""));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
}
