package com.graphic.editor.shapes;

import com.graphic.editor.shapes.interfaces.Resizable;

public class Circle extends Shape implements Resizable {
    private Shape.Point center;
    private double radius;

    public static Circle create() {
        return new Circle();
    }

    public static Circle create(double x, double y, double radius){
        try {
            return new Circle(x, y, radius);
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
            return new Circle(x, y);
        }
    }

    public static Circle create(double x, double y) {
        return new Circle(x,y);
    }

    private Circle() {
        this(0, 0);
    }

    private Circle(double x, double y) {
        super(new Point[]{new Point(x, y)});
        name = "Circle";
        this.center = points[0];
        this.radius = 1;
    }

    private Circle (double x, double y, double radius) throws IllegalArgumentException {
        super(new Point[]{new Point(x, y)});
        name = "Circle";
        this.center = points[0];
        if (radius < 0) throw new IllegalArgumentException();
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void colorize(String color) {
        this.color = color;
    }

    @Override
    public void move(double x, double y) {
        center.setX(center.getX() + x);
        center.setY(center.getY() + y);
    }

    @Override
    public void resize(double x, double y) {
        radius *= Math.max(x, y);
    }

    @Override
    public String toString() {
        return color + " Circle {" +
                "center = " + center +
                ", radius = " + radius +
                '}';
    }
}
