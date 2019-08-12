package com.xyz.app.StringHR;

public class DeleteConsecutiveChars {
    public static String superReducedString(String s) {
        if (s.length() == 0) return "Empty String";
        StringBuilder result = new StringBuilder(s);
        for (int j = 0; j < s.length(); j++) {
            char[] letters = result.toString().toCharArray();
            result.setLength(0);
            int i = 0;
            while (i < letters.length) {
                int k = i + 1;
                while (k < letters.length && letters[i] == letters[k]) {
                    k++;
                }
                if ((k - i) % 2 == 1) result.append(letters[i]);
                i = k;

            }
        }

        System.out.println(result.toString());

        if (result.length() == 0) {
            return "Empty String";
        } else {
            return result.toString();
        }
    }

//    for (int i = 1; i < str.length(); i++) {
//        if (str.charAt(i) == str.charAt(i-1)) {
//            str = str.substring(0, i-1) + str.substring(i+1);
//            i = 0;
//        }
//    }
//        if (str.length() == 0) {
//        System.out.println("Empty String");
//    } else {
//        System.out.println (str);
//    }

//    StringBuffer s = new StringBuffer(stdin.nextLine());
//        for(int i = 1; i < s.length(); i++) {
//        if(s.charAt(i) == s.charAt(i-1)) {
//            s.delete(i-1, i+1);
//            i = 0;
//        }
//    }
//        if(s.length() == 0) System.out.println("Empty String");
//        else System.out.println(s);
}
