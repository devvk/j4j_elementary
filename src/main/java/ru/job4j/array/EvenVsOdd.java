package ru.job4j.array;

public class EvenVsOdd {
    /**
     * Если выиграла первая команда, то нужно вернуть 1, если вторая, то 2, если ничья то 0.
     */
    public static int whoWin(int[] players) {
        int win = 0;
        int team1 = 0;
        int team2 = 0;
        for (int i = 0; i < players.length; i++) {
            if (i % 2 == 0) {
                team1 += players[i];
            } else {
                team2 += players[i];
            }
        }

        if (team1 > team2) {
            win = 1;
        } else if (team2 > team1) {
            win = 2;
        }
        return win;
    }
}
