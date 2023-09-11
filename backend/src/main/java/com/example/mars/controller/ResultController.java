package com.example.mars.controller;

import com.example.mars.entity.Operation;
import com.example.mars.entity.Result;
import com.example.mars.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/operation")
public class ResultController {

    @Autowired
    private ResultService resultService;

    @PostMapping("/postresult")
    public ResponseEntity<?> addResult(@RequestBody Result result, @RequestBody Operation operation) {
        result = operation.getResult();

        resultService.add(operation.getId(), result.getResult());
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getresult")
    public ResponseEntity<?> getResult(@RequestBody Result result) {
        return (ResponseEntity<?>) ResponseEntity.ok(result.getResult());
    }
}
