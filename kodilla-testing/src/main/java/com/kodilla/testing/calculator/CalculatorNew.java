package com.kodilla.testing.calculator;

public class CalculatorNew {

    static void calculatePlus(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    static void calculateMinus(int x, int y) {
        int result2 = x - y;
        System.out.println(result2);
    }
    public static void main(String[] args) {
        CalculatorNew calculator = new CalculatorNew();

        calculator.calculatePlus(1, 5);
        calculator.calculateMinus(3,3);

    }
}