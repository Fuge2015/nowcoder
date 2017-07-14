package com.fuge;

import org.jetbrains.annotations.NotNull;

import java.util.NoSuchElementException;

/**
 * Created by dongfu on 17-3-27.
 */
public class MinNumberInRotateArray {

    /**
     * Time complexity: O(n)
     *
     * @param array a rotate array.
     * @return the smallest number in array.
     */
    public int minNumberInRotateArray(int[] array) {
        if (array.length == 0) {
            throw new NoSuchElementException();
        }
        if (array.length == 1) {
            return array[1];
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return array[i + 1];
            }
        }
        return array[0];
    }

    @NotNull
    public int minNumberInRotateArray2(int[] array) {
        if (array == null || array.length == 0) {
            throw new NoSuchElementException();
        }
        return array[0] < array[array.length - 1] ? array[0] : getMin(array, 0, array.length - 1);
    }

    private int getMin(int[] array, int low, int high) {
        if (low == high) {
            return array[low];
        }
        if (low + 1 == high) {
            return array[low] < array[high] ? array[low] : array[high];
        }
        int mid = (low + high) / 2;
        return array[mid] <= array[high] ? getMin(array, low, mid) : getMin(array, mid, high);
    }
}
