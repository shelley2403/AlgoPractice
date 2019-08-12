package com.xyz.app.Sorting;

/* n= 4, index - 1)
         4(0)
        /   \
     10(1)   3(2)
    /   \
 5(3)    1(4)
          4(0)
        /   \
     10(1)   3(2)
    /   \
 5(3)    1(4)
          10(0)
        /   \
     4(1)   3(2)
    /   \
 5(3)    1(4)

          10(0)
        /   \
     5(1)   3(2)
    /   \
 4(3)    1(4)
          1(0)
        /   \
     5(1)   3(2)
    /   \
 4(3)    10(4)
         5(0)
        /   \
     1(1)   3(2)
    /   \
 4(3)    10(4)
          5(0)
        /   \
     4(1)   3(2)
    /   \
 1(3)    10(4)
          1(0)
        /   \
     4(1)   3(2)
    /   \
 5(3)    10(4)


 n = 3, index = 1)
         4(0)
        /   \
     1(1)   3(2)
    /   \
 5(3)    10(4)
          3(0)
        /   \
     1(1)   4(2)
    /   \
 5(3)    10(4)


 n = 2 index = 0)
          1(0)
        /   \
     3(1)   4(2)
    /   \
 5(3)    10(4)

  n = 1 index = 0)
          1(0)
        /   \
     3(1)   4(2)
    /   \
 5(3)    10(4)
 */



public class HeapSort {

    //Always start with last subtree

    public void maxHeapify(int[] arr, int n, int index) {
        int largest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if (left < n && arr[largest] < arr[left]) {
            largest = left;
        }

        if (right < n && arr[largest] < arr[right]) {
            largest = right;
        }

        if (largest != index) {
            int temp = arr[largest];
            arr[largest] = arr[index];
            arr[index] = temp;
            //If it breaks the subtrees later to it, then redo it
            maxHeapify(arr, n, largest);
        }
    }

    public int[] sort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            maxHeapify(arr, n, i);
        }

        for(int i=n-1; i>0; i--){
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            maxHeapify(arr, i, 0);
        }

        return arr;
    }
}
