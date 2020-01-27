package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public static ArrayList<Integer> check (ArrayList<Integer> numbers) {
        for (int k = 0; k < numbers.size(); k++) {
            if ((numbers.get(k) % 2) == 0) ;
            numbers.remove(k);
        }
        return numbers;
    }
}