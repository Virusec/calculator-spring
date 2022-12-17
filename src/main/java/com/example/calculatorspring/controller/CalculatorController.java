package com.example.calculatorspring.controller;

import com.example.calculatorspring.exceptions.DivisionByZeroException;
import com.example.calculatorspring.exceptions.EmptyParamException;
import com.example.calculatorspring.service.CalculatorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @ExceptionHandler(value = DivisionByZeroException.class)
    public ResponseEntity<String> divisionByZeroHandler(DivisionByZeroException e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }

    @ExceptionHandler(value = EmptyParamException.class)
    public ResponseEntity<String> emptyParamException(EmptyParamException e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }

    @GetMapping
    public String hello() {
        return this.calculatorService.hello();
    }

    @GetMapping("/plus")
    public String sum(@RequestParam(name = "num1",required = false) Integer num1, @RequestParam(name = "num2",required = false) Integer num2) {
        return num1 + " + " + num2 + " = " + this.calculatorService.sum(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(name = "num1",required = false) Integer num1, @RequestParam(name = "num2",required = false) Integer num2) {
        return num1 + " + " + num2 + " = " + this.calculatorService.subtract(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(name = "num1", required = false) Integer num1, @RequestParam(name = "num2",required = false) Integer num2) {
        return num1 + " * " + num2 + " = " + this.calculatorService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam(name = "num1", required = false) Integer num1, @RequestParam(name = "num2",required = false) Integer num2) {
        return num1 + " / " + num2 + " = " + this.calculatorService.divide(num1, num2);
    }
}
