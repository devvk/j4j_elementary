package ru.job4j.array;

public class PrintEvenElements {
    public static String printEvenInts(int[] numbers) {
        String ln = System.lineSeparator();
        StringBuilder res = new StringBuilder("Элементы массива с чётными индексами, начиная с последнего: " + ln);
        for (int i = 0; i < numbers.length; i++) {
            if ((numbers.length - 1 - i) % 2 == 0) {
                res.append(numbers[numbers.length - 1 - i]).append(ln);
            }
        }
        return res.toString();
    }
}
