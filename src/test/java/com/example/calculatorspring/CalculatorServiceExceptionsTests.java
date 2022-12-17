package com.example.calculatorspring;

import com.example.calculatorspring.exceptions.DivisionByZeroException;
import com.example.calculatorspring.exceptions.EmptyParamException;
import com.example.calculatorspring.service.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceExceptionsTests {
    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    public void sumWithoutFirstParamReturnException() {
        Assertions.assertThrows(EmptyParamException.class, () -> calculatorService.sum(null, 2));
    }

    @Test
    public void sumWithoutSecondParamReturnException() {
        Assertions.assertThrows(EmptyParamException.class, () -> calculatorService.sum(2, null));
    }

    @Test
    public void sumWithoutParamsReturnException() {
        Assertions.assertThrows(EmptyParamException.class, () -> calculatorService.sum(null, null));
    }

    @Test
    public void subtractWithoutFirstParamReturnException() {
        Assertions.assertThrows(EmptyParamException.class, () -> calculatorService.subtract(null, 2));
    }

    @Test
    public void subtractWithoutSecondParamReturnException() {
        Assertions.assertThrows(EmptyParamException.class, () -> calculatorService.subtract(2, null));
    }

    @Test
    public void subtractWithoutParamsReturnException() {
        Assertions.assertThrows(EmptyParamException.class, () -> calculatorService.subtract(null, null));
    }

    @Test
    public void multiplyWithoutFirstParamReturnException() {
        Assertions.assertThrows(EmptyParamException.class, () -> calculatorService.multiply(null, 2));
    }

    @Test
    public void multiplyWithoutSecondParamReturnException() {
        Assertions.assertThrows(EmptyParamException.class, () -> calculatorService.multiply(2, null));
    }

    @Test
    public void multiplyWithoutParamsReturnException() {
        Assertions.assertThrows(EmptyParamException.class, () -> calculatorService.multiply(null, null));
    }

    @Test
    public void divideWithoutFirstParamReturnException() {
        Assertions.assertThrows(EmptyParamException.class, () -> calculatorService.divide(null, 2));
    }

    @Test
    public void divideWithoutSecondParamReturnException() {
        Assertions.assertThrows(EmptyParamException.class, () -> calculatorService.divide(2, null));
    }

    @Test
    public void divideWithoutParamsReturnException() {
        Assertions.assertThrows(EmptyParamException.class, () -> calculatorService.divide(null, null));
    }

    @Test
    public void divideByZeroReturnException() {
        Assertions.assertThrows(DivisionByZeroException.class, () -> calculatorService.divide(5, 0));
    }
}
