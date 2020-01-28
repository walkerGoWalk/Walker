package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {
    private Double base;
    private Double height;

    public Triangle (Double base, Double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public Double getField() {
        return base * height / 2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle myTriangle = (Triangle) o;
        return Objects.equals(base, myTriangle.base) &&
                Objects.equals(height, myTriangle.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, height);
    }

}