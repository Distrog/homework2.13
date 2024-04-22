package ru.stroganov.calculator_tests.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.stroganov.calculator_tests.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String greeting() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public Integer plus(@RequestParam(required = false) Integer num1,
                        @RequestParam(required = false) Integer num2) {
        return calculatorService.plus(num1, num2);
    }

    @GetMapping("/minus")
    public Integer minus(@RequestParam(required = false) Integer num1,
                         @RequestParam(required = false) Integer num2) {
        return calculatorService.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public Integer multiply(@RequestParam(required = false) Integer num1,
                            @RequestParam(required = false) Integer num2) {
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public Integer divide(@RequestParam(required = false) Integer num1,
                          @RequestParam(required = false) Integer num2) {
        return calculatorService.divide(num1, num2);
    }
}
