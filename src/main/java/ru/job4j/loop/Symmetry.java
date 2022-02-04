package ru.job4j.loop;

public class Symmetry {
    public static boolean check(int num) {
        boolean isSymmetry = true;
        String str = Integer.toString(num);
        for (int i = 0; i < (str.length() / 2); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isSymmetry = false;
                break;
            }
        }
        return isSymmetry;
    }
}
