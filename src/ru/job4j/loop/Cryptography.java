package ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {
        if (s.length() == 0) {
            s = "empty";
        } else if (s.length() > 4) {
            for (int i = 0; i < s.length() - 4; i++) {
                StringBuilder sb = new StringBuilder(s);
                sb.setCharAt(i, '#');
                s = sb.toString();
            }
        }
        return s;
    }
}