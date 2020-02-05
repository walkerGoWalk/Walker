package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> allShapes = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        allShapes.add(shape);
    }
    public boolean removeFigure(Shape shape) {
        return allShapes.remove(shape);

    }


    public Shape getFigure(int n) {
        Shape myShape = null;

        if(n >= 0 && n < allShapes.size()){
            myShape = allShapes.get(n);
        }
        return myShape;
    }

    public int getShapeSize() {
       return allShapes.size();
    }
}