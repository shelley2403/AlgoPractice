package com.xyz.app.StringManipulation;

public class CharAppendPermutations {

    // 0 -> word.substring(0) -> sap word.substring(0, 0) -> ""
    // 1 -> word.substring(1) -> ap word.substring(0, 1) -> s
    // 2 -> word.substring(2) -> p word.substring(0, 2) -> sa
    // 3 -> word.substring(3) -> "" word.substring(0, 3) -> sap
    public static String[] doCharPermutations(String word, char c) {
        if (word == null || word.isEmpty()) {
            return new String[]{};
        }

        String[] results = new String[word.length() + 1];
        for (int i = 0; i <= word.length(); i++) {
            String last = word.substring(i);
            String first = word.substring(0, i);
            String permWord = first + c + last;
            results[i] = permWord;
        }

        return results;
    }
}
