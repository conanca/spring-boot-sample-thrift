package com.xinhuanet.crawler.example.calculator.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
@Component
public class CalculatorService {
    private static final Logger logger = LoggerFactory.getLogger(CalculatorService.class);

    public int add(int num1, int num2) {
        logger.info("Calculating...");
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        if(num2 == 0) {
            throw new IllegalArgumentException("num2 must not be zero");
        }

        return num1 / num2;
    }
}