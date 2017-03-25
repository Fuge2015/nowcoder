package com.fuge;

/**
 * Created by dongfu on 17-3-24.
 */
public class FindInArray {
    public boolean find(int target, int [][] array) {
        if (array[0].length < 1) {
            return false;
        }
        if (array[0][0] == target) {
            return true;
        }
        if (array[0][0] > target) {
            return false;
        }
        for (int i = 0; i < array.length; i ++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == target) {
                    return true;
                } else if (array[i][j] > target) {
                    break;
                }
            }
        }
        return false;

    }

    public String replaceSpace(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result += s.charAt(i) == ' '?"%20":s.charAt(i);
        }
        return result;
    }
}
