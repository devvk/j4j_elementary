package ru.job4j.loop;

public class ModWithLoop {
    public static void main(String[] args) {
        System.out.println(mod(4, 2));  // 0
        System.out.println(mod(3, 2));  // 1
        System.out.println(mod(8, 3));  // 2
        System.out.println(mod(0, 3));   // 0
    }

    public static int mod(int n, int d) {
        int mod = 0;
        while (n >= d) {
            n -= d;
            mod = n;
        }
        return mod;
    }
}
