package com.fuge;

import java.math.BigInteger;

/**
 * Created by dongfu on 17-7-13.
 */
public class Print1ToMaxOfNDigits {
    public void print1ToMaxOfNDigits(int n) {
        if (n < 1) {
            return;
        }
        BigInteger bi = new BigInteger("1");
        String maxStr = "";
        for (int i = 0; i < n; i++) {
            maxStr += "9";
        }
        BigInteger max = new BigInteger(maxStr);
        for (BigInteger i = bi; i.compareTo(max) <= 0; i = i.add(BigInteger.ONE)) {
            System.out.println(i);
        }
    }
}
