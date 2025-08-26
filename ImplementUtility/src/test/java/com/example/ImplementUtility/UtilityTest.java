package com.example.ImplementUtility;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UtilityTest {

    @Test
    void testAdd() {
        assertEquals(30, ImplUClass.add(10, 20));
        assertEquals(-5, ImplUClass.add(-10, 5));
        assertEquals(0, ImplUClass.add(0, 0));
    }

    @Test
    void testSub() {
        assertEquals(5, ImplUClass.sub(15, 10));
        assertEquals(-15, ImplUClass.sub(-10, 5));
        assertEquals(0, ImplUClass.sub(5, 5));
    }

    @Test
    void testMul() {
        assertEquals(200, ImplUClass.mul(10, 20));
        assertEquals(-50, ImplUClass.mul(-10, 5));
        assertEquals(0, ImplUClass.mul(0, 10));
    }

    @Test
    void testDiv() {
        assertEquals(5, ImplUClass.div(10, 2));
        assertEquals(-2, ImplUClass.div(-10, 5));
    }

    @Test
    void testDivByZero() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            ImplUClass.div(10, 0);
        });
        assertEquals("Division by zero not allowed", exception.getMessage());
    }
}
