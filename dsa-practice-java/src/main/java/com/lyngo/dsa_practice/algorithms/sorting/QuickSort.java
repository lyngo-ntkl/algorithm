package com.lyngo.dsa_practice.algorithms.sorting;

public class QuickSort {
    public int[] quickSort(int[] nums) {
        partition(nums, 0, nums.length - 1);
        return nums;
    }

    private void partition(int[] nums, int start, int end) {
        if (end - start + 1 < 2) {
            return;
        }

        int pivot = nums[end], i = start, j = end - 1, tmp;
        while (i <= j) {
            if (nums[i] < pivot) {
                i++;
            } else {
                if (nums[j] < pivot) {
                    tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                    i++;
                    j--;
                } else {
                    j--;
                }
            }
        }

        tmp = nums[i];
        nums[i] = nums[end];
        nums[end] = tmp;

        partition(nums, start, i - 1);
        partition(nums, i + 1, end);
    }
}
