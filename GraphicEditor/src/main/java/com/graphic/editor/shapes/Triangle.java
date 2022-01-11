package com.graphic.editor.shapes;

public class Triangle extends Shape{
    private Shape.Point p1;
    private Shape.Point p2;
    private Shape.Point p3;

    public static Triangle create(double[][] coords) {
        if (coords.length == 3 && coords[0].length == 2 && coords[1].length == 2 && coords[2].length == 2) {
            return new Triangle(coords);
        } else if (coords[0].length == 2) {
            return new Triangle(new double[][]{
                    {coords[0][0], coords[0][1]},
                    {coords[0][0] + 1, coords[0][1]},
                    {coords[0][0] + 1, coords[0][1] + 1}
            });
        } else
            return new Triangle(new double[][]{
                    {0, 0},
                    {1, 0},
                    {1, 1}
            });

    }

    private Triangle(double[][] coords) {
        super(new Point[]{
                new Point(coords[0][0], coords[0][1]),
                new Point(coords[1][0], coords[1][1]),
                new Point(coords[2][0], coords[2][1]),
        });

        name = "Triangle";
        p1 = points[0];
        p2 = points[1];
        p3 = points[2];
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

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    @Override
    public void colorize(String color) {
        this.color = color;
    }

    @Override
    public void move(double x, double y) {
        p1.setX(p1.getX() + x);
        p1.setY(p1.getY() + y);
        p2.setX(p2.getX() + x);
        p2.setY(p2.getY() + y);
        p3.setX(p3.getX() + x);
        p3.setY(p3.getY() + y);
    }

    @Override
    public void resize(double x, double y) {
        p2.setX(p2.getX() + x);
        p3.setX(p3.getX() + x);
        p3.setY(p3.getY() + y);
    }

    @Override
    public String toString() {
        return color + " Triangle{" +
                ", p1=" + p1 +
                ", p2=" + p2 +
                ", p3=" + p3 +
                '}';
    }
}
