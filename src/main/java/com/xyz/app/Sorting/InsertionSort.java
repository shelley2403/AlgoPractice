package com.xyz.app.Sorting;

public class InsertionSort {

    public int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int min = arr[i];
            int j;
            for (j = i; j > 0 && arr[j - 1] > min; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = min;
        }

        return arr;
    }
}
