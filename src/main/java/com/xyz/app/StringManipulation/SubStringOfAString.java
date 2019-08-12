package com.xyz.app.StringManipulation;

import static java.lang.String.valueOf;

/*
        a          a b      a b c   a b c d
        b          b c      b c d
        c          c d
        d

*/
public class SubStringOfAString {
    private StringBuilder sb = new StringBuilder();
    private String lastAppended = "";

    public void createSubSequence(String word) {
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            System.out.println(letter);
            lastAppended = valueOf(letter);
            for (int j = i + 1; j < word.length(); j++) {
                String combination = lastAppended + word.charAt(j);
                System.out.println(combination);
                lastAppended = combination;
            }
        }
    }

    public void print(String input) {

        int length = input.length();
        //start point
        for (int startPoint = 0; startPoint < length; startPoint++) {
            //group sizes
            for (int j = startPoint; j <= length; j++) {
                //if start point = 1 then
                //grp size = 1 , print 1
                //grp size = 2, print 1 2
                //grp size = 3, print 1 2 3 ans so on
                for (int k = startPoint; k < j; k++) {
                    System.out.print(input.charAt(k) + " ");
                }
                System.out.println();
            }
        }
    }
}
