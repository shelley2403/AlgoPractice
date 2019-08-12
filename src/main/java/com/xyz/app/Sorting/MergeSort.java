package com.xyz.app.Sorting;

public class MergeSort {
    public void merge(int[] arr, int start, int m, int end) {
        int n1 = m - start + 1;
        int n2 = end - m;

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for (int i = 0; i < n1; i++) {
            arr1[i] = arr[start + i];
        }
        for (int j = 0; j < n2; j++) {
            arr2[j] = arr[m + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = start;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while(j<n2) {
            arr[k] = arr2[i];
            j++;
            k++;
        }

    }

    public void sort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sort(arr, l, m);
            sort(arr, l + 1, r);
            merge(arr, l, m, r);
        }
    }
}
