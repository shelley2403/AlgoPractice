package com.xyz.app.StringManipulation;

public class Factorial {

    public static int factIterative(int num) {
        if (num == 0) return 1;
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static int factRecusive(int num) {
        if (num == 0) return 1;
        return num * factRecusive(num - 1);
    }
}
