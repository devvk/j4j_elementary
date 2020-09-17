package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double result1 = x2 - x1;
        double result2 = y2 - y1;
        result1 = Math.pow(result1, 2);
        result2 = Math.pow(result2, 2);

        double rsl = result1 + result2;
        return Math.sqrt(rsl);
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result2 = Point.distance(1, 2, 3, 4);
        System.out.println("result (1, 2) to (3, 4) " + result2);
    }
}
