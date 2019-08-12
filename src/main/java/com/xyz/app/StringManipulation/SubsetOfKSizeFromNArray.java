package com.xyz.app.StringManipulation;

public class SubsetOfKSizeFromNArray {

    static void printSubSequenceOfK(int n, int k) {
        int[] result = new int[n];
        computeSubSequence(result, n, k, 0, result);
    }

    private static void computeSubSequence(int[] input, int elements, int desiredLength, int currentLength, int[] tempResult) {
        if(elements == 0) {
            return;
        }
        else if(currentLength == desiredLength) {
            printResult(tempResult, input);
        }

        tempResult[elements-1] = 0;
        computeSubSequence(input, elements-1, desiredLength, currentLength, tempResult);
        tempResult[elements-1] = 1;
        computeSubSequence(input, elements-1, desiredLength, currentLength+1, tempResult);
    }

    private static void printResult(int[] tempResult, int[] input) {
        for(int i =0; i<tempResult.length; i++){
            if(tempResult[i] == 1) {
                System.out.print(input[i] + " ");
            }
        }

        System.out.println();
    }
}
