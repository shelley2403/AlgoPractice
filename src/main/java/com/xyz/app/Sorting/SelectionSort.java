package com.xyz.app.Sorting;

public class SelectionSort {

    public int[] sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[i] = temp;
            arr[min] = arr[i];
        }
        return arr;
    }

}
