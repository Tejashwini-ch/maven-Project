package com.example.ImplementUtility;

import com.example.UtilityExample.UtilityExampleClass;

public class ImplUClass {
    public static void main(String[] args) {
        int sum = UtilityExampleClass.add(100, 20);
        int diff = UtilityExampleClass.sub(100, 20);
        int prod = UtilityExampleClass.mul(100, 20);
        int div = UtilityExampleClass.div(100, 20);

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + diff);
        System.out.println("Multiplication: " + prod);
        System.out.println("Division: " + div);
    }
}

