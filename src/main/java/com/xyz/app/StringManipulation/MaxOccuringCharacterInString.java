package com.xyz.app.StringManipulation;

import java.util.HashMap;
import java.util.Map;

public class MaxOccuringCharacterInString {
    public static void findMaxOccuringString(String input) {
        int maxCount = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (hm.containsKey(c)) {
                int count = hm.get(c) + 1;
                if (count > maxCount) {
                    maxCount = count;
                }
                hm.put(c, count);
            } else {
                hm.put(c, 1);
            }
        }

        for(Map.Entry entry : hm.entrySet()) {
            if(entry.getValue().equals(maxCount)) {
                System.out.println("Character: " + entry.getKey() + " has occurred max times:  " +  maxCount);
            }
        }
    }
}
