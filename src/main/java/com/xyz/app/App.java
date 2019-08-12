package com.xyz.app;

import com.xyz.app.DP.EggDropRec;
import com.xyz.app.Matrices.HourGlass2D;
import com.xyz.app.Sorting.HeapSort;
import com.xyz.app.Sorting.QuickSort;
import com.xyz.app.StringHR.DeleteConsecutiveChars;
import com.xyz.app.StringHR.QueueBribeChaos;
import com.xyz.app.StringManipulation.*;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String[] cap = CharAppendPermutations.doCharPermutations("sap", '&');
        String[] cap1 = CharAppendPermutations.doCharPermutations(null, 't');
        String rvc = ReplaceVowelWithConsonant.replace("abcdefg");
        String rvc2 = ReplaceVowelWithConsonant.replaceVowels("abcdefg");
        String rvc1 = ReplaceVowelWithConsonant.replace("aaaabccceee");
        String reversed = ReverseStringRecursion.doReverse("kayak");
        MaxOccuringCharacterInString.findMaxOccuringString("abcdefg");
        int factorial = Factorial.factRecusive(1);
        NBitString nb = new NBitString(3);
        nb.generateStringFromNBits(3);
        SubSequenceString sb = new SubSequenceString();
        //sb.printSubSequences("xyz");

//        for(String c: cap){
//            System.out.println(c);
//        }
        SubStringOfAString ss = new SubStringOfAString();
        //ss.print("abcd");
        String[] words = {"This", "is", "a", "text", "justification", "problem", "in", "tutorial", "horizon"};
        TextJustification tj = new TextJustification();
        String result = tj.find(words, 20, 0);
        String result1 = tj.justify(words, 20, 0);
//        System.out.println(result);
//        System.out.println(result1);

        int[] x = {100, 20, 15, 30, 5, 75, 40};
        int[] x1 = {4, 10, 3, 5, 1};
//        BubbleSort bs = new BubbleSort();
//        RecursiveBubbleSort rbs = new RecursiveBubbleSort();
//        rbs.sort(x,0);


        HeapSort hs = new HeapSort();
        //int[] sorted = hs.sort(x1);
        //System.out.println(Arrays.toString(sorted));

        QuickSort qs = new QuickSort();
        //qs.sort(x);
        System.out.println(Arrays.toString(x));

         DeleteConsecutiveChars.superReducedString("baab");

//        int mat[][] = { { 1, 2, 3, 4 , 5, 6 },
////                { 5, 6, 7, 8 , 9, 10},
////                { 9, 10, 11, 12, 13, 14 }, { 15, 16, 17, 18, 19, 20 } };
////        System.out.println(HourGlass2D.hourglassSum(mat));

         int[] input = {
                 2,
                 5,
                 2, 1, 5, 3, 4,
                 5,
                 2,5,1,3,4
         };

        QueueBribeChaos.minimunBribes(input);

//        System.out.println("EggDrop: "+EggDropRec.getDrops(2, 5));
//        System.out.println(EggDropRec.getDropsDP(2,5));
    }
}
