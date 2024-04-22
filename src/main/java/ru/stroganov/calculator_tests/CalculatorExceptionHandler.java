package ru.stroganov.calculator_tests;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CalculatorExceptionHandler {
    @ExceptionHandler(NullPointerException.class)
    public void handleNullPointerException(NullPointerException e){
        System.out.println("Один из параметров не подан");
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public void handleIllegalArgumentException(IllegalArgumentException e){
        System.out.println("На ноль делить нельзя");
    }
}
