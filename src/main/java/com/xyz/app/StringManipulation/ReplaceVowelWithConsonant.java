package com.xyz.app.StringManipulation;

//aaaabccceee -> bbbbbccc
//abcdefg -> bbcdffg
public class ReplaceVowelWithConsonant {
    String result = "";

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public static String replace(String word) {
        String result = "";
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (!isVowel(letter)) {
                result += letter;
                while (count > 0) {
                    result += letter;
                    count--;
                }
            } else {
                count++;
            }
        }
        return result;
    }

    //better- start from the reverse
    public static String replaceVowels(String input) {
        String result = "";
        char last_visited_consonant = '\0';
        for (int i = input.length() - 1; i >= 0; i--) {
            char x = input.charAt(i);
            if (isVowel(x)) {
                if (last_visited_consonant != '\0') {
                    result = last_visited_consonant + result;
                }
            } else {
                result = x + result;
                last_visited_consonant = x;
            }
        }
        return result;
    }
}
