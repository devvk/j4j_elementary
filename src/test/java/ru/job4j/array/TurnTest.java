package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TurnTest {

    /**
     * Тест проверяет переворот массива с чётным числом элементов.
     */
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] data = new int[]{4, 1, 6, 2};
        int[] result = Turn.back(data);
        int[] expected = new int[]{2, 6, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    /**
     * Тест проверяет переворот массива с нечётным числом элементов.
     */
    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] data = new int[]{1, 2, 3, 4, 5};
        int[] result = Turn.back(data);
        int[] expected = new int[]{5, 4, 3, 2, 1};
        assertThat(result).containsExactly(expected);
    }
}
