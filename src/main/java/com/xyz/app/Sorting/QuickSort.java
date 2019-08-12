package com.xyz.app.Sorting;

public class QuickSort {

    public void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    public void sort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int pivot = (left + right) / 2;
        int index = partition(arr, left, right, pivot);
        sort(arr, left, index - 1);
        sort(arr, index, right);
    }

    private int partition(int[] arr, int left, int right, int pivot) {
        while (left <= right) {
            while (arr[left] < arr[pivot]) {
                left++;
            }
            while (arr[right] > arr[pivot]) {
                right--;
            }

            if(left <= right){
                swap(left, right, arr);
                left++;
                right--;
            }
        }

        return left;
    }

    private void swap(int left, int right, int[] arr) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

/*
    public int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = begin-1;
        for (int j = begin; j < end; j++) {
            if(arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;
        return i+1;
    }

    public void quicksort(int[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);
            quicksort(arr, begin, partitionIndex - 1);
            quicksort(arr, partitionIndex + 1, end);
        }
    }
 */
}
