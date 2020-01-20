package com.kodilla;
import java.util.Scanner;

class Calculator {
    static void calculatePlus(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    static void calculateMinus(int x, int y) {
        int result2 = x - y;
        System.out.println(result2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Addition");
        System.out.println("write 1st number:");
        int a = input.nextInt();

        System.out.println("write 2nd number:");
        int b = input.nextInt();

        calculatePlus(a, b);

        System.out.println();
        System.out.println("Subtraction");
        System.out.println("write 1st number:");
        int x = input.nextInt();

        System.out.println("write 2nd number:");
        int y = input.nextInt();
        calculateMinus(x, y);
                }
            }