package com.xyz.app.StringManipulation;

public class SubSequenceString {
    public void printSubSequences(String input) {
        int[] result = new int[input.length()];
        printNBitString(input.length(), input, result);
    }

    private void printNBitString(int length, String word, int[] result) {
        if (length == 0) {
            printResult(word, result);
            return;
        }

        result[length - 1] = 0;
        printNBitString(length - 1, word, result);
        result[length - 1] = 1;
        printNBitString(length - 1, word, result);
    }

    private void printResult(String word, int[] result) {
        StringBuilder sequence = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            if (result[i] == 1) {
                sequence.append(word.charAt(i));
            }
        }
        if(sequence.length() == 0) System.out.println("{}");
        else System.out.println(sequence.toString());
    }
}
