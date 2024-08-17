package ru.job4j.calculator;

public class Fit {

    private static final double COEFFICIENT = 1.15;

    private static final int MAN_BASE_HEIGHT = 100;

    private static final int WOMAN_BASE_HEIGHT = 110;

    public static double calculateWeight(short height, int baseHeight) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be positive");
        }
        return (height - baseHeight) * COEFFICIENT;
    }

    public static double manWeight(short height) {
        return calculateWeight(height, MAN_BASE_HEIGHT);
    }

    public static double womanWeight(short height) {
        return calculateWeight(height, WOMAN_BASE_HEIGHT);
    }

    public static void main(String[] args) {
        short manHeight = 173;
        double manWeight = manWeight(manHeight);
        System.out.printf("Man %d cm is %.2f kg\n", manHeight, manWeight);

        short womanHeight = 173;
        double womanWeight = womanWeight(womanHeight);
        System.out.printf("Woman %d cm is %.2f kg\n", womanHeight, womanWeight);
    }
}
