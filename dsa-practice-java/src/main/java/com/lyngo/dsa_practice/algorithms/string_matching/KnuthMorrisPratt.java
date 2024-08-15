package com.lyngo.dsa_practice.algorithms.string_matching;
public class KnuthMorrisPratt {
    public void match(String val, String pattern) {

    }

    public int[] createLookupTable(String pattern) {
        int prePointer = 0, curPointer = 1, length = pattern.length();
        int[] table = new int[length];
        char[] patternChar = pattern.toCharArray();
        while (curPointer < length) {
            if (patternChar[prePointer] == patternChar[curPointer]) {
                table[curPointer] = ++prePointer;
                curPointer++;
            } else {
                if (prePointer == 0) {
                    table[curPointer] = 0;
                    curPointer++;
                } else {
                    prePointer = (int) table[prePointer - 1];
                }
            }
        }
        return table;
    }
}