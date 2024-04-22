package ru.stroganov.calculator_tests.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImp implements CalculatorService {
    @Override
    public Integer plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NullPointerException();
        }
        return num1 + num2;
    }

    @Override
    public Integer minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NullPointerException();
        }
        return num1 - num2;
    }

    @Override
    public Integer multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NullPointerException();
        }
        return num1 * num2;
    }

    @Override
    public Integer divide(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NullPointerException();
        }
        if (num2 == 0) {
            throw new IllegalArgumentException();
        }
        return num1 / num2;
    }
}
