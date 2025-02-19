package prog2.ha1.testing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Retro calculator")
class CalculatorTest {

    @Test
    @DisplayName("should display correct number after pressing digit keys")
    void testDigitInput() {
        Calculator calc = new Calculator();

        calc.pressDigitKey(4);
        calc.pressDigitKey(2);

        String expected = "42";
        String actual = calc.readScreen();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("should display result after adding two positive numbers")
    void testPositiveAddition() {
        Calculator calc = new Calculator();

        calc.pressDigitKey(2);
        calc.pressBinaryOperationKey("+");
        calc.pressDigitKey(2);
        calc.pressEqualsKey();

        String expected = "4";
        String actual = calc.readScreen();

        assertEquals(expected, actual);


    }

    //TODO hier weitere Tests erstellen

    @Test
    @DisplayName("should display result after multiplying two positive numbers")
    void testPositiveMultiplication() {
        Calculator calc = new Calculator();

        calc.pressDigitKey(5);
        calc.pressBinaryOperationKey("x");
        calc.pressDigitKey(5);
        calc.pressEqualsKey();

        String expected = "25";
        String actual = calc.readScreen();

        assertEquals(expected, actual);
    }


    @Test
    @DisplayName("should display result after dividing a number with zero")
    void testdivision() {
        Calculator calc = new Calculator();

        calc.pressDigitKey(0);
        calc.pressBinaryOperationKey("/");
        calc.pressDigitKey(5);
        calc.pressEqualsKey();


        String expected = "0";
        String actual = calc.readScreen();

        assertEquals(expected, actual);


    }

    @Test
    @DisplayName("should display result after replacing the x with the number( display as a decimal number")
    void test1xBartu() {
        Calculator calc = new Calculator();

        calc.pressDigitKey(5);
        calc.pressUnaryOperationKey("1/x");


        String expected = "0.2";
        String actual = calc.readScreen();

        assertEquals(expected, actual);


    }

}



