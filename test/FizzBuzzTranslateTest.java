import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @org.junit.jupiter.api.Test
    void testPrint() {
        int number = 3;
        String expected = "Fizz";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected, result);
    }

    @Test
    void testPrint1() {
        int number = 5;
        String expected = "Buzz";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected, result);
    }

    @Test
    void testPrint2() {
        int number = 15;
        String expected = "FizzBuzz";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected, result);
    }

    @Test
    void testPrint3() {
        int number = 26;
        String expected = "hai sau ";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected, result);
    }

    @Test
    void testPrint4() {
        int number = 23;
        String expected = "Fizz";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected, result);
    }

    @Test
    void testPrint5() {
        int number = 25;
        String expected = "Buzz";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected, result);
    }
}