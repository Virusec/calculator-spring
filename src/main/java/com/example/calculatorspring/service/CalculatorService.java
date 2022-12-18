package com.example.calculatorspring.service;

import com.example.calculatorspring.exceptions.DivisionByZeroException;
import com.example.calculatorspring.exceptions.EmptyParamException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String hello() {
        return "<h1>Добро пожаловать в калькулятор!<h1>";
    }

    public void checkParam(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new EmptyParamException("<h2>Необходимо ввести 2 числа!<h2>");
        }
    }

    public Integer sum(Integer num1, Integer num2) {
        checkParam(num1, num2);
        return num1 + num2;
    }

    public Integer subtract(Integer num1, Integer num2) {
        checkParam(num1, num2);
        return num1 - num2;
    }

    public Integer multiply(Integer num1, Integer num2) {
        checkParam(num1, num2);
        return num1 * num2;
    }

    public Double divide(Integer num1, Integer num2) {
        checkParam(num1, num2);
        if (num2 == 0) {
            throw new DivisionByZeroException("<h2>Делить на нуль нельзя!<h2>");
        }
        return (double) num1 / num2;
    }
}
