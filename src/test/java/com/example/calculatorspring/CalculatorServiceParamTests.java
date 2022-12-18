package com.example.calculatorspring;

import com.example.calculatorspring.service.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

public class CalculatorServiceParamTests {
    private final CalculatorService calculatorService = new CalculatorService();

    public static List<Arguments> plusTestsData() {
        return List.of(
                Arguments.of(3, 3, 6),
                Arguments.of(1, -4, -3),
                Arguments.of(0, 3, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("plusTestsData")
    public void plusTest(Integer num1, Integer num2, Integer result) {
        Assertions.assertEquals(result, calculatorService.sum(num1, num2));
    }

    public static List<Arguments> subtractTestData() {
        return List.of(
                Arguments.of(3, -2, 5),
                Arguments.of(3, 2, 1),
                Arguments.of(-3, -2, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("subtractTestData")
    public void subtractTest(Integer num1, Integer num2, Integer result) {
        Assertions.assertEquals(result, calculatorService.subtract(num1, num2));
    }

    public static List<Arguments> multiplyTestData() {
        return List.of(
                Arguments.of(5, 0, 0),
                Arguments.of(5, 3, 15),
                Arguments.of(-2, 5, -10)
        );
    }

    @ParameterizedTest
    @MethodSource("multiplyTestData")
    public void multiplyTest(Integer num1, Integer num2, Integer result) {
        Assertions.assertEquals(result, calculatorService.multiply(num1, num2));
    }

    public static List<Arguments> divideTestData() {
        return List.of(
                Arguments.of(4, 4, 1),
                Arguments.of(0, 4, 0),
                Arguments.of(8, -4, -2)
        );
    }

    @ParameterizedTest
    @MethodSource("divideTestData")
    public void divideTest(Integer num1, Integer num2, Integer result) {
        Assertions.assertEquals(result, calculatorService.divide(num1, num2));
    }
}
