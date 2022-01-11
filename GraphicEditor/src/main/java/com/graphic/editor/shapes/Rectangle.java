package com.graphic.editor.shapes;

public class Rectangle extends Shape {
    private Shape.Point p1;
    private Shape.Point p2;
    private Shape.Point p3;
    private Shape.Point p4;

    public static Rectangle create(com.graphic.editor.shapes.Point point, double a, double b) {
        return new Rectangle(new double[][]{
                {point.getX(), point.getY()},
                {point.getX() + a, point.getY()},
                {point.getX() + a, point.getY() - b},
                {point.getX(), point.getY() - b}
        });
    }

    public static Rectangle create(double[][] coords) {
        if (coords.length == 4 && coords[0].length == 2 && coords[1].length == 2 && coords[2].length == 2 && coords[3].length == 2) {
            double x1 = coords[0][0];
            double y1 = coords[0][1];
            double x2 = coords[1][0];
            double y2 = coords[1][1];
            double x3 = coords[2][0];
            double y3 = coords[2][1];
            double x4 = coords[3][0];
            double y4 = coords[3][1];
            return new Rectangle(new double[][]{
                    {x1, y1}, {x2, y2}, {x3, y3}, {x4, y4}
            });
        } else if (coords.length >= 2 && coords[0].length == 2 && coords[1].length == 2) {
            double x1 = coords[0][0];
            double y1 = coords[0][1];
            double x2 = coords[1][0];
            double y2 = coords[1][1];
            return new Rectangle(new double[][]{
                    {x1, y1}, {x2, y1}, {x2, y2}, {x1, y2}
            });
        } else if (coords[0].length == 2) {
            double x1 = coords[0][0];
            double y1 = coords[0][1];
            return new Rectangle(new double[][]{
                    {x1,y1}, {x1 + 1, y1}, {x1 + 1, y1 - 1}, {x1, y1 - 1}
            });
        } else
        return new Rectangle(new double[][]{
                {0,1}, {1, 1}, {1, 0}, {0, 0}
        });
    }

    private Rectangle(double[][] coords) {
        super(new Point[]{
                new Point(coords[0][0], coords[0][1]),
                new Point(coords[1][0], coords[1][1]),
                new Point(coords[2][0], coords[2][1]),
                new Point(coords[3][0], coords[3][1])
        });
        name = "Rectangle";
        p1 = this.points[0];
        p2 = this.points[1];
        p3 = this.points[2];
        p4 = this.points[3];
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

    public Point getP4() {
        return p4;
    }

    public void setP4(Point p4) {
        this.p4 = p4;
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
        p4.setX(p4.getX() + x);
        p4.setY(p4.getY() + y);
    }

    @Override
    public void resize(double x, double y) {
        p2.setX(p2.getX() + x);
        p3.setX(p3.getX() + x);
        p3.setY(p3.getY() + y);
        p4.setY(p4.getY() + y);
    }

    @Override
    public String toString() {
        return color + " Rectangle {" +
                "p1 = " + p1 +
                ", p2 = " + p2 +
                ", p3 = " + p3 +
                ", p4 = " + p4 +
                '}';
    }
}
