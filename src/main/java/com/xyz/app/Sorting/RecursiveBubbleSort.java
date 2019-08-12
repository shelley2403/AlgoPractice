package com.xyz.app.Sorting;

public class RecursiveBubbleSort {

    public void sort(int[] arr, int n) {
        if (n == arr.length - 1) return;
        for (int j = 0; j < arr.length - 1 - n; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = temp;
            }
        }
        sort(arr, n + 1);
    }

    public void sort1(int[] arr, int n) {
        if (n == 1) return;
        for (int j = 0; j < n - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = temp;
            }
        }
        sort(arr, n - 1);
    }

}
