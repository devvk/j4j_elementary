package ru.job4j.loop;

public class Mortgage {
    /*
    Метод должен вычислять количество лет, необходимых для погашения кредита.
    amount - сумма выданная по кредиту,
    salary - годовой доход,
    percent - процентная ставка по кредиту.
     */
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
            amount += amount * (int) percent / 100 - salary;
            year++;
        }
        return year;
    }
}
