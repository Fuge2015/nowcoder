package com.fuge;

/**
 * Created by dongfu on 17-3-27.
 */
public class Fibonacci {
    int [] fibo = new int[40];
    boolean [] flag = new boolean[40];
    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (flag[n]) {
            return fibo[n];
        }
        int result =  fibonacci(n - 1) + fibonacci(n - 2);
        fibo[n] = result;
        flag[n] = true;
        return result;
    }
}
