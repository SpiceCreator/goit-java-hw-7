package com.graphic.editor.shapes;

public class Point extends Shape {
    private double x;
    private double y;

    public static com.graphic.editor.shapes.Point create(double x, double y) {
        return new com.graphic.editor.shapes.Point(x, y);
    }

    private Point(double x, double y) {
        super(new Point[] {new Point(x, y)});
        name = "Point";
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    @Override
    public void colorize(String color) {
        this.color = color;
    }

    @Override
    public void move(double x, double y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public void resize(double x, double y) {}

    @Override
    public String toString() {
        return  color + " Point {" +
                "x = " + x +
                ", y = " + y +
                '}';
    }

}
