package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextWorker {


    public static boolean isPalindrome (String word) {
        String word2 = word.trim();
        for (int i = 0; i < word2.length() / 2; i++) {
                if ((word2.charAt(i) == word2.charAt(word2.length() - i - 1))) {
                    return true;
                } else {
                    return false;
                }
        }
        return false;
    }

    public static String getSequance(String text, char symbolStart, char symbolEnd) {
        int i = text.indexOf(symbolStart);
        int j = text.lastIndexOf(symbolEnd);
        if (i != -1 && j != -1) {
            return text.substring(i,j+1);
        }
        return null;
    }

    public static String createSequance(int start, int end) {
        String secuance = "";
        if (start <= end) {
            for (int i = start; i <= end; i++) {
                secuance += i + " ";
            }
            return secuance.trim();
        }
        return null;
    }

    public static String insertAll (String initialText, String[] toInsert, int[] indexes) {
        StringBuilder stringBuilder = new StringBuilder(initialText);
        if (toInsert.length == indexes.length) {
            for (int i = 0; i < indexes.length; i++) {
                for (int j = 0; j < toInsert.length; j++) {
                    if (i == j) {
                        stringBuilder.insert(indexes[i], toInsert[j]);
                    }
                }
            }
        }
            return stringBuilder.toString();
    }

    public static String insertAllChange (String initialText, String[] toInsert, int[] indexes) {
        StringBuilder stringBuilder = new StringBuilder(initialText);
        if (toInsert.length == indexes.length) {
            for (int i = 0; i < indexes.length; i++) {
                for (int j = 0; j < toInsert.length; j++) {
                    if (i == j) {
                        if (i > 0) {
                            indexes[i] += toInsert[j - 1].length();
                        }
                        stringBuilder.insert(indexes[i], toInsert[j]);
                    }
                }
            }
        }
        return stringBuilder.toString();
    }

    public static String[] findAllMails(String text) {
        Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+", Pattern.CASE_INSENSITIVE);
        List<String> list = new ArrayList<String>();
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            list.add(matcher.group());
        }
        String[] array = new String[list.size()];
        array = list.toArray(array);
        return array;
    }

    public static char indexOutput(String text, char symbol) {
        int j = text.indexOf(symbol);
        int i = 0;
        if (text.indexOf(symbol) != -1) {
            char[] sym = text.toCharArray();
            for (i = 0; i < text.length(); i++) {
                if (sym[i] == symbol) {
                    System.out.print(i+ " ");
                }
            }
        }
        return '\r';
    }
}
