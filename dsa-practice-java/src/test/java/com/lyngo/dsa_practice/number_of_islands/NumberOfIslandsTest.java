package com.lyngo.dsa_practice.number_of_islands;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.lyngo.dsa_practice.practices.number_of_islands.NumberOfIslands;

public class NumberOfIslandsTest {
    private final NumberOfIslands numberOfIslands = new NumberOfIslands();

    @Test
    public void numIslands_(char[][] grid, int expected) {
        int actual = numberOfIslands.numIslands(grid);
        assertEquals(expected, actual);
    }
}
