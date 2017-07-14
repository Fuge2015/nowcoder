package com.fuge;

/**
 * Created by dongfu on 17-7-13.
 */
public class PrintMatrix {
    public void printMatrixClockWizely(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
        int temp = Math.min(matrix.length, matrix[0].length);
        int loopCount = temp / 2;
        for (int i = 0; i < loopCount; i++) {
            int minH = i;
            int maxH = matrix[0].length - i - 1;
            int minV = i;
            int maxV = matrix.length -i -1;
            for (int j = minH; j < maxH; j++) {
                System.out.println(matrix[minV][j]);
            }
            for (int j = minV; j < maxV; j++) {
                System.out.println(matrix[j][maxH]);
            }
            for (int j = maxH; j > minH; j--) {
                System.out.println(matrix[maxV][j]);
            }
            for (int j = maxV; j > minV; j--) {
                System.out.println(matrix[j][minH]);
            }
        }
        if (temp >> 1 << 1 != temp) {
            if (matrix.length > matrix[0].length) {
                int min = loopCount;
                int max = matrix.length - loopCount -1;
                for (int j = min; j <= max; j++) {
                    System.out.println(matrix[j][loopCount]);
                }
            } else {
                int min = loopCount;
                int max = matrix[0].length - loopCount -1;
                for (int j = min; j <= max; j++) {
                    System.out.println(matrix[loopCount][j]);
                }
            }
        }
    }
}
