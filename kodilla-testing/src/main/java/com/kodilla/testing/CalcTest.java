package com.kodilla.testing;

import com.kodilla.testing.calculator.CalculatorNew;

public class CalcTest {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int a = 10;
        int b = 5;

        System.out.println("\nTesting Calculator class:");

        System.out.print("Method 'add': ");
        if (calculator.calculatePlus(a, b) == a + b) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.print("Method 'substract': ");
        if (calculator.calculateMinus(a, b) == a - b) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

    }
}
