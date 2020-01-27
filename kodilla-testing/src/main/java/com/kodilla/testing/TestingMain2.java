package com.kodilla.testing;

import com.kodilla.testing.calculator.CalculatorNew;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain2 {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
//calculator
        CalculatorNew calculator = new CalculatorNew();
        int a = 1;
        int b = 5;
        int x = 5;
        int y = 1;


        System.out.println("calculatePlus ");
        if (calculator.calculatePlus(a, b) == a + b) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("calculateMinus ");
        if (calculator.calculateMinus(x, y) == x - y) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

    }
}



