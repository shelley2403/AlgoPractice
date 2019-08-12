package com.xyz.app.StringManipulation;

public class TextJustification {

    public String justify(String[] words, int maxWidth, int index) {
        String result = "";
        int remainingLength = maxWidth;
        for (int i = 0; i < words.length; i++) {
            String wordToInsert = words[i];
            if (wordToInsert.length() + 1 < remainingLength && wordToInsert.length() + 1 < maxWidth) {
                if (!result.equals("")) {
                    result += '@' + wordToInsert;
                    remainingLength -= wordToInsert.length() + 1;
                } else {
                    result += wordToInsert;
                    remainingLength -= wordToInsert.length();
                }
            } else if (remainingLength != 0) {
                if (!result.contains("@")) {
//                    for (int j = 0; j < remainingLength; j++) {
//                        result += result + " ";
//                    }
                } else {
                    String arr[] = result.split("@");
                    int mod = remainingLength % (arr.length - 1);
                    int splitedSpace = remainingLength / (arr.length - 1);
                    StringBuilder spaceToAppend = new StringBuilder();
                    for (int k = 0; k < splitedSpace; k++) {
                        spaceToAppend.append(" ");
                    }
                    StringBuilder leftmostWord = new StringBuilder(spaceToAppend);
                    for (int l = 0; l < mod; l++) {
                        leftmostWord.append(" ");
                    }
                    result = result.replaceAll("@", spaceToAppend.toString());
                    result = result.replaceFirst("@", leftmostWord.toString());
                }
                result = result + "\n" + wordToInsert;
                remainingLength = maxWidth - wordToInsert.length();
            }

            result = result.replaceAll("@", " ");
        }
        return result;
    }

    public String find(String[] words, int maxWidth, int index) {
        if (index < words.length) {
            String result = "";
            int currentLen = 0;
            int remainLength = maxWidth;
            while (result.length() < maxWidth && index < words.length) {
                if (remainLength >= words[index].length() + 1) { //remainingLength+1 for space
                    if (!result.equals("")) {
                        result += "@" + words[index];
                        currentLen = words[index].length() + 1;
                    } else {
                        result += words[index];
                        currentLen = words[index].length();
                    }
                    remainLength -= currentLen;
                    index++;
                } else if (remainLength > 0) {
                    if (result.contains("@") == false) {
                        for (int i = 0; i < remainLength; i++) {
                            result = result + " ";
                        }
                    } else {
                        //go in only if there at least 2 words
                        String[] arr = result.split("@");
                        int mod = (remainLength % (arr.length - 1));
                        int splitedSpace = remainLength / (arr.length - 1);
                        String spaces = " ";
                        for (int i = 0; i < splitedSpace; i++) {
                            spaces = spaces + " ";
                        }
                        String leftmost = spaces;
                        for (int i = 0; i < mod; i++) {
                            leftmost = leftmost + " ";
                        }
                        result = result.replaceFirst("@", leftmost);
                        result = result.replaceAll("@", spaces);
                    }
                }
            }
            result = result.replaceAll("@", " ");
            return result + "\n" + find(words, maxWidth, index);
        } else {
            return "";
        }
    }
}
