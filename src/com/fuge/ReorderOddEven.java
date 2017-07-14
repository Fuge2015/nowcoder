package com.fuge;

/**
 * Created by dongfu on 17-7-14.
 */
public class ReorderOddEven {
    public void reorder(int[] array) {
        if (array.length < 2) {
            return;
        }
        int low = 0;
        int high = array.length - 1;
        int pivot = array[high];
        while (low < high) {
            while (array[low] >> 1 << 1 != array[low] && low < high) {
                low++;
            }
            array[high] = array[low];
            while (array[high] >> 1 << 1 == array[high] && low < high) {
                high--;
            }
            array[low] = array[high];
            array[high] = pivot;
        }
    }
}
