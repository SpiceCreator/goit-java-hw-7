package com.graphic.editor.shapes;

import java.lang.Math;

public class Line extends Shape {
    private Shape.Point p1;
    private Shape.Point p2;

    public static Line create(com.graphic.editor.shapes.Point p1, com.graphic.editor.shapes.Point p2) {
        return new Line(p1, p2);
    }

    public static Line create(double[][] coords) {
        try {
            return new Line(coords);
        } catch (ArrayIndexOutOfBoundsException ex) {
            return new Line(new double[][] {{0,0}, {0,1}});
        }
    }

    private Line(double[][] coords) {
        // Use Line.create() rather than new Line()
        super(new Point[]{
                new Point(coords[0][0], coords[0][1]),
                new Point(coords[1][0], coords[1][1])
        });
        name = "Line";
        this.p1 = this.points[0];
        this.p2 = this.points[1];
    }

    private Line(com.graphic.editor.shapes.Point p1, com.graphic.editor.shapes.Point p2) {
        super(new Point[]{
                new Point(p1.getX(), p1.getY()),
                new Point(p2.getX(), p2.getY())
        });
        this.p1 = this.points[0];
        this.p2 = this.points[1];
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public double getLength() {
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
    }

    @Override
    public void colorize (String color) {
        this.color = color;
    }

    @Override
    public void move(double x, double y) {
        p1.setX(p1.getX() + x);
        p1.setY(p1.getY() + y);
        p2.setX(p2.getX() + x);
        p2.setY(p2.getY() + y);
    }

    @Override
    public void resize(double x, double y) {
        p2.setX(p2.getX() + x);
        p2.setY(p2.getY() + y);
        move(-x/2, -y/2);
    }

    @Override
    public String toString() {
        return color + " Line {" +
                "p1 = " + p1 +
                ", p2 = " + p2 +
                '}';
    }
}
