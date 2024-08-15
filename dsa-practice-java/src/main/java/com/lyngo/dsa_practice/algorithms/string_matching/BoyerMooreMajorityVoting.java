package com.lyngo.dsa_practice.algorithms.string_matching;

public class BoyerMooreMajorityVoting {
    public <T> T findMajorityValue(T[] array) {
        if (array.length == 0) {
            return null;
        }

        int count = 0;
        T major = null;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == major) {
                count++;
            } else if (array[i] != major) {
                count--;
            }

            if (count == 0) {
                major = array[i];
                count = 1;
            }
        }
        return major;
    }

    // public <T> T findMajorityValueSlow(T[] array) {
    //     HashMap<T, Integer> count = new HashMap<>();
    //     for (int i = 0; i < array.length; i++) {
    //         count.put(array[i], count.getOrDefault(array[i], 0) + 1);
    //     }
    //     count.values().stream().sorted()
    // }
}