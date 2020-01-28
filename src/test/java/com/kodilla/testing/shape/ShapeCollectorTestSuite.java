package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Beginning of tests.");
    }
    @AfterClass
    public static void afterAllTests() {
        System.out.println("Tests are finished.");
    }
    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(8.0);
        //When
        shapeCollector.addFigure(circle);
        Shape myFigure;
        myFigure = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(circle, myFigure);
    }


    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(8.0);
        shapeCollector.addFigure(circle);
        //When
        boolean result = shapeCollector.removeFigure(circle);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.getShapeSize());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(5.1, 5.3);
        shapeCollector.addFigure(triangle);
        //When
        Shape result2 = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(triangle, result2);
    }
}