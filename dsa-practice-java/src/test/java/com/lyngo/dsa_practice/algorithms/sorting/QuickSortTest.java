package com.lyngo.dsa_practice.algorithms.sorting;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class QuickSortTest {
    private final QuickSort quickSort = new QuickSort();

    @ParameterizedTest
    @MethodSource("generateData")
    public void quickSort_givenIntegerArray_returnSortedArray(int[] nums) {
        int[] actual = Arrays.copyOf(quickSort.quickSort(nums), nums.length);
        Arrays.sort(nums);

        assertArrayEquals(actual, nums);
    }

    static Stream<int[]> generateData() {
        return Stream.of(
            new int[] {3, 1, 4, 5, 9, 2, 6},
            new int[] {8, 5 ,7, 9, 17, 28},
            new int[] {3, 7, 1, 9, 5, 2, 8, 4, 6},
            new int[] {87, 23, -45, 92, 16, 55, -3, 78, 42, 101, -99, 63, 2, 0, -54},
            new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
            new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1},
            new int[] {-5, -2, -8, -1, -9, -4, -7, -3, -6, 0},
            new int[] {1000, -500, 350, 820, -200, 150, 600, -400, 250, 900},
            new int[] {},
            new int[] {42},
            new int[] {-100, 50, -75, 120, -25, 80, -90, 30, -60, 10, -40, 70, -50, 20, -30, 60, -10, 40, -20, 5},
            new int[] {3452, -9876, 1234, 5678, -2345, 6789, -4567, 7890, -1234, 5432, -987, 123, -456, 789, -12, 34, -56, 78, -9, 1},
            new int[] {100, 1, 99, 2, 98, 3, 97, 4, 96, 5},
            new int[] {1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5},
            new int[] {20, 19, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 1}
        );
    }
}