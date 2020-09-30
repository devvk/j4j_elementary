package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private static final int[] COINS = {10, 5, 2, 1};

    /**
     * Жадный алгоритм. Сдача в кофе машине
     */
    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        money -= price;
        for (int coin : COINS) {
            while (money > 0) {
                if (money - coin >= 0) {
                    money -= coin;
                    rsl[size] = coin;
                    size++;
                } else {
                    break;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
