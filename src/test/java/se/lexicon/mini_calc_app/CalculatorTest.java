package se.lexicon.mini_calc_app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    @Test
    public void test_addition(){

        //Arrange
        double number1 = 70;
        double number2 = 30;
        double expected = 100;

        //Act
        double actual = Calculator.addition(number1,number2);

        //Assert
        assertEquals(expected, actual);

    }

}