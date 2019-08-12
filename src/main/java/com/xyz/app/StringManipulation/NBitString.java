package com.xyz.app.StringManipulation;

/*
n = 3
Output:
[0, 0, 0]    [1, 0, 0]    [0, 1, 0]    [1, 1, 0]
[0, 0, 1]     [1, 0, 1]     [0, 1, 1]    [1, 1, 1]
*/

import java.util.Arrays;

public class NBitString {

    private int[] result;

    public NBitString(int n) {
        result = new int[n];
    }

    public void generateStringFromNBits(int n) {
        if (n <= 0) {
            System.out.println(Arrays.toString(result));

            return;
        }
        result[n - 1] = 0;
        generateStringFromNBits(n - 1);
        result[n - 1] = 1;
        generateStringFromNBits(n - 1);
    }
}
