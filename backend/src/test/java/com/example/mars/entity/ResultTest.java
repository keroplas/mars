package com.example.mars.entity;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ResultTest {

    public Result testResult = new Result(1L, 2);

    @Test
    void getResult() {
        assertEquals(2, testResult.getResult());
    }

    @Test
    void setResult() {
        testResult.setResult(3);
        assertEquals(3, testResult.getResult());
    }
}