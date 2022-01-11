package com.graphic.editor.shapes;

public class GraphicEditorTester {
    public static void main(String[] args) {
//        Point p1 = new Point(0, 0);
//        ShapeInitializer SI = new ShapeInitializer();
//        SI.getShapeName(p1);
//        Point p2 = new Point(3, 4);
//        Line l1 = new Line(p1, p2);
//        System.out.println(l1.getLength());
//        System.out.println(l1);
//        p1.move(2,1);
//        System.out.println(l1.getLength());
//        System.out.println(l1);
//        l1.move(2, 5);
//        System.out.println(l1);
//        Circle c1 = new Circle( new Point(1, 1), 5);
//        System.out.println(c1);
//        System.out.println(c1.getName());
//        c1.move(5, 10);
//        System.out.println(c1);
//        System.out.println(p1);
//        c1.resize(1.2);
//        System.out.println(c1);
        //System.out.println(Math.cos(Math.PI / 3));

        Point point1 = Point.create(0, 0);
        System.out.println(point1);
        System.out.println(point1.points[0]);

        Point point2 = Point.create(4, 6);

        Line line = Line.create(new double[][]{{0, 0}, {3, 4}});
        System.out.println(line);
        System.out.println(line.points[1]);
        Line line1 = Line.create(new double[][]{{0, 0}});
        System.out.println(line1);
        System.out.println(line1.points[0]);
        System.out.println(line.getP1());
        System.out.println(line.getP2());

        System.out.println(line.getLength());
        line.move(5, 4);
        System.out.println(line);

        point1.move(5,5);
        System.out.println(point1);

        Line line2 = Line.create(point1, point2);
        System.out.println(point1);
        System.out.println(point2);
        System.out.println(line2);

        Circle circle = Circle.create(5, 10, -5);
        System.out.println(circle);

        System.out.println(line);

        Rectangle rectangle = Rectangle.create(point1, 10, 20);
        System.out.println(rectangle);

    }
}