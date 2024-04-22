package ru.stroganov.calculator_tests.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static ru.stroganov.calculator_tests.service.CalculatorServiceTestConstants.*;

class CalculatorServiceImpParameterizedTest {
    CalculatorService out = new CalculatorServiceImp();

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldPlus(Integer num1, Integer num2) {
        Integer actual = out.plus(num1, num2);
        Integer expected = num1 + num2;
        Assertions.assertEquals(actual, expected);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldMinus(Integer num1, Integer num2) {
        Integer actual = out.minus(num1, num2);
        Integer expected = num1 - num2;
        Assertions.assertEquals(actual, expected);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldDivide(Integer num1, Integer num2) {
        Integer actual = out.divide(num1, num2);
        Integer expected = num1 / num2;
        Assertions.assertEquals(actual, expected);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldMultiply(Integer num1, Integer num2) {
        Integer actual = out.multiply(num1, num2);
        Integer expected = num1 * num2;
        Assertions.assertEquals(actual, expected);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestsWithNull")
    public void shouldPlusWithNull(Integer num1, Integer num2) {
        Assertions.assertThrows(NullPointerException.class,
                () -> out.plus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestsWithNull")
    public void shouldMinusWithNull(Integer num1, Integer num2) {
        Assertions.assertThrows(NullPointerException.class,
                () -> out.minus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestsWithNull")
    public void shouldDivideWithNull(Integer num1, Integer num2) {
        Assertions.assertThrows(NullPointerException.class,
                () -> out.divide(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestsWithNull")
    public void shouldMultiplyWithNull(Integer num1, Integer num2) {
        Assertions.assertThrows(NullPointerException.class,
                () -> out.multiply(num1, num2));
    }

    public static Stream<Arguments> provideParamsForTests() {
        return Stream.of(Arguments.of(NUM1, NUM2),
                Arguments.of(NUM1, NUM3),
                Arguments.of(NUM1, NUM4),
                Arguments.of(NUM2, NUM3),
                Arguments.of(NUM2, NUM4),
                Arguments.of(NUM3, NUM4));
    }


    public static Stream<Arguments> provideParamsForTestsWithNull() {
        return Stream.of(Arguments.of(NUM1, NUM_NULL),
                Arguments.of(NUM_NULL, NUM3),
                Arguments.of(NUM2, NUM_NULL),
                Arguments.of(NUM_NULL, NUM_NULL),
                Arguments.of(NUM_NULL, NUM4));
    }
}