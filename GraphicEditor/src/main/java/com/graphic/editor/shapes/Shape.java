package com.graphic.editor.shapes;

import com.graphic.editor.shapes.interfaces.Colorizable;
import com.graphic.editor.shapes.interfaces.Moveable;
import com.graphic.editor.shapes.interfaces.Resizable;
import com.graphic.editor.shapes.interfaces.Rotatable;

public abstract class Shape implements Moveable, Colorizable, Rotatable, Resizable {
    protected String name = "Shape";
    protected String color = "White";
    protected Shape.Point[] points;

    public Shape(Shape.Point[] points) {
        this.points = points;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    static class Point {
        private double x;
        private double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }

        @Override
        public String toString() {
            return  "Point {" +
                    "x = " + x +
                    ", y = " + y +
                    '}';
        }
    }
}
