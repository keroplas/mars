package com.example.mars.controller;

import com.example.mars.entity.Operation;
import com.example.mars.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/operation")
public class OperationController {

    @Autowired
    private OperationService operationService;

    @PostMapping("/calculate")
    public ResponseEntity<?> calcular(@RequestBody Operation operation) {
        double result = 0.0;
        String election = Arrays.toString(operation.getOperations());

        switch (election) {
            case "add":
                result = operationService.add(operation.getOp1(), operation.getOp2());
                break;
            case "deduce":
                result = operationService.deduct(operation.getOp1(), operation.getOp2());
                break;
            case "multiply":
                result = operationService.multiply(operation.getOp1(), operation.getOp2());
                break;
            case "divide":
                result = operationService.divide(operation.getOp1(), operation.getOp2());
                break;
            default:
                return ResponseEntity.badRequest().body("Not a valid operator");
        }
        return ResponseEntity.ok(result);
    }
}
