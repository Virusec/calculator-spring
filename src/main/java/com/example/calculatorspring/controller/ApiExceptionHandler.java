package com.example.calculatorspring.controller;

import com.example.calculatorspring.exceptions.DivisionByZeroException;
import com.example.calculatorspring.exceptions.EmptyParamException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApiExceptionHandler {
    @ExceptionHandler(DivisionByZeroException.class)
    public ResponseEntity<String> divisionByZeroHandler(DivisionByZeroException e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }

    @ExceptionHandler(EmptyParamException.class)
    public ResponseEntity<String> emptyParamException(EmptyParamException e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }
}
