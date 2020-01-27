package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {


    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        OddNumbersExterminator.check(numbers);
        int result = numbers.size();
        Assert.assertEquals(result, 0);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //arrange
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(2);

        //act
        OddNumbersExterminator.check(numbers);
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        evenNumbers.add(3);
        evenNumbers.add(5);
        //assert
        for (int i = 0; i < numbers.size(); i++) {
            Assert.assertEquals(evenNumbers.get(i), numbers.get(i));
        }
    }
}