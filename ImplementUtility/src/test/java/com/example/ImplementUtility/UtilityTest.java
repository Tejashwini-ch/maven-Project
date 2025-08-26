package com.example.ImplementUtility;

import org.junit.jupiter.api.Test;

import com.example.UtilityExample.UtilityExampleClass;

import static org.junit.jupiter.api.Assertions.*;

class UtilityTest {

    @Test
    void testAdd() {
        assertEquals(30, UtilityExampleClass.add(10, 20));
        assertEquals(-5, UtilityExampleClass.add(-10, 5));
    }

    @Test
    void testSub() {
        assertEquals(5, UtilityExampleClass.sub(15, 10));
        assertEquals(-15, UtilityExampleClass.sub(-10, 5));
    }

    @Test
    void testMul() {
        assertEquals(200, UtilityExampleClass.mul(10, 20));
        assertEquals(-50, UtilityExampleClass.mul(-10, 5));
    }

    @Test
    void testDiv() {
        assertEquals(5, UtilityExampleClass.div(10, 2));
        assertEquals(-2, UtilityExampleClass.div(-10, 5));
    }

    @Test
    void testDivByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            UtilityExampleClass.div(10, 0);
        });
        assertEquals("Division by zero not allowed", exception.getMessage());
    }
} 