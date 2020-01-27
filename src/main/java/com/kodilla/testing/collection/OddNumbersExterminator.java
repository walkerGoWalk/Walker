package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class OddNumbersExterminator {

    public static ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

        // works too!
//        Iterator<Integer> i = numbers.iterator();
//        while (i.hasNext()) {
//            Integer number = i.next();
//            if (number % 2 != 0) {
//                i.remove();
//            }
//
//        }
//        System.out.println(numbers);
//        return numbers;


        for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext(); ) {
            System.out.println("numbers size: " + numbers.size());
            Integer number = iterator.next();
            System.out.println("first element: " + number);

            if (number % 2 != 0) {
                System.out.println("This is Even Number: " + number);
                iterator.remove();
            }
            System.out.println("actual numbers list: " + numbers);
        }

        return numbers;


        //works!
//        System.out.println(numbers);
//        numbers.removeIf(i -> i % 2 != 0);
//        System.out.println(numbers);
//        return numbers;
//    }
    }
}