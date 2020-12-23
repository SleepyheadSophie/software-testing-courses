package ru.stqa.pft.sandbox;

public class Runner {

    public static void main(String[] args) {
        Point p1 = new Point(0,0);
        Point p2 = new Point(3,3);
        System.out.println(p1.distance(p2));
        System.out.println(pointDistance(p1, p2));
    }

    public static double pointDistance(Point p1, Point p2) {
        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
    }

}
