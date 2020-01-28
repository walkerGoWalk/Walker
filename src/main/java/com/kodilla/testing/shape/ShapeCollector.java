package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> allShapes = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        allShapes.add(shape);
    }
    public boolean removeFigure(Shape shape) {
        return allShapes.remove(shape);
      //  boolean result = false;

//        if(allShapes.contains(shape)){
//            allShapes.remove(shape);
//            result = true;
//        }
//        return result;
    }


    public Shape getFigure(int n) {
        Shape myShape = null;

        if(n >= 0 && n < allShapes.size()){
            myShape = allShapes.get(n);
        }
        return myShape;
    }
//    public void showFigures() {
//        String result = new String();
//        for(Shape figure: allShapes){
//            result = result + figure + ", field: " + figure.getField();
//        }
//        System.out.println(result);
//    }
    public int getShapeSize() {
       return allShapes.size();
    }
}