import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @org.junit.jupiter.api.Test
    void testPrint() {
        int number = 3;
        String expected = "Fizz";
        String result = FizzBuzz.print(number);
        assertEquals(expected, result);
    }

    @Test
    void testPrint1() {
        int number = 5;
        String expected = "Buzz";
        String result = FizzBuzz.print(number);
        assertEquals(expected, result);
    }

    @Test
    void testPrint2() {
        int number = 15;
        String expected = "FizzBuzz";
        String result = FizzBuzz.print(number);
        assertEquals(expected, result);
    }

    @Test
    void testPrint3() {
        int number = 26;
        String expected = "hai sau ";
        String result = FizzBuzz.print(number);
        assertEquals(expected, result);
    }
}