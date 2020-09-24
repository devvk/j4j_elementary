package ru.job4j.loop;

public class DigitSum {
    public static int sum(int num) {
        int sum = 0;
        String number = Integer.toString(num);
        for (int i = 1; i <= number.length(); i++) {
            sum += i;
        }
        return sum;
    }
}
