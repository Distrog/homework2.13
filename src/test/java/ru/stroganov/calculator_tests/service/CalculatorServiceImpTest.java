package ru.stroganov.calculator_tests.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static ru.stroganov.calculator_tests.service.CalculatorServiceTestConstants.*;

class CalculatorServiceImpTest {

    private final CalculatorService out = new CalculatorServiceImp();

    @Test
    void shouldPlusTwoArguments() {
        Integer actual = out.plus(NUM1, NUM2);
        Integer expected = NUM1 + NUM2;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void shouldPlusOneArgument() {
        Assertions.assertThrows(NullPointerException.class,
                () -> out.plus(NUM1, NUM_NULL));
    }

    @Test
    void shouldMinusTwoArguments() {
        Integer actual = out.minus(NUM1, NUM2);
        Integer expected = NUM1 - NUM2;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void shouldMinusOneArgument() {
        Assertions.assertThrows(NullPointerException.class,
                () -> out.minus(NUM1, NUM_NULL));
    }

    @Test
    void shouldMultiplyTwoArguments() {
        Integer actual = out.multiply(NUM1, NUM2);
        Integer expected = NUM1 * NUM2;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void shouldMultiplyOneArgument() {
        Assertions.assertThrows(NullPointerException.class,
                () -> out.multiply(NUM1, NUM_NULL));
    }

    @Test
    void shouldDivideTwoArguments() {
        Integer actual = out.divide(NUM1, NUM2);
        Integer expected = NUM1 / NUM2;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void shouldDivideOneArgument() {
        Assertions.assertThrows(NullPointerException.class,
                () -> out.divide(NUM1, NUM_NULL));
    }
    @Test
    void shouldDivideByZero() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> out.divide(NUM1, ZERO));
    }
}