package ru.job4j.loop;

public class Symmetry {
    public static boolean check(int i) {
        boolean symmetry = true;
        String str = String.valueOf(i);
        for (int j = 0; j < (str.length() / 2); j++) {
            if (str.charAt(j) != str.charAt(str.length() - j - 1)) {
                symmetry = false;
                break;
            }
        }
        return symmetry;
    }
}
