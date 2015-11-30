package com.xinhuanet.crawler.example.calculator.handler;

import com.xinhuanet.crawler.example.calculator.TCalculatorService;
import com.xinhuanet.crawler.example.calculator.TDivisionByZeroException;
import com.xinhuanet.crawler.example.calculator.TOperation;
import com.xinhuanet.crawler.example.calculator.service.CalculatorService;
import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculatorServiceHandler implements TCalculatorService.Iface {

    @Autowired
    CalculatorService calculatorService;

    @Override
    public int calculate(int num1, int num2, TOperation op) throws TException {
        switch(op) {
            case ADD:
                return calculatorService.add(num1, num2);
            case SUBTRACT:
                return calculatorService.subtract(num1, num2);
            case MULTIPLY:
                return calculatorService.multiply(num1, num2);
            case DIVIDE:
                try {
                    return calculatorService.divide(num1, num2);
                } catch(IllegalArgumentException e) {
                    throw new TDivisionByZeroException();
                }
            default:
                throw new TException("Unknown operation " + op);
        }
    }
}