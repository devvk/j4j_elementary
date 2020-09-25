package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        // тип_данных[] имя_переменной = new тип_данных[количество_ячеек];
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        System.out.println("Размер массива 'ages' равен: " + ages.length);
        System.out.println("Размер массива 'surnames' равен: " + surnames.length);
        System.out.println("Размер массива 'prices' равен: " + prices.length);
    }
}
