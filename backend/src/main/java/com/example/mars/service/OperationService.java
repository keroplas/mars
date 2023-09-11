package com.example.mars.service;

import org.springframework.stereotype.Service;

@Service
public class OperationService {
    public double add(double op1, double op2) {
        return op1 + op2;
    }

    public double deduct(double op1, double op2) {
        return op1 - op2;
    }

    public double multiply(double op1, double op2) {
        return op1 * op2;
    }

    public double divide(double op1, double op2) {
        if (op2 != 0) {
            return op1 / op2;
        } else {
            throw new IllegalArgumentException("You cannot divide between 0");
        }
    }
}
