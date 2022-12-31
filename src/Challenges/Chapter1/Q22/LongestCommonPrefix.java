package Challenges.Chapter1.Q22;

import java.util.Arrays;

public class LongestCommonPrefix {
    private static String[] texts = {"abc", "abcd", "abcde", "ab", "abcd", "abcdef"};

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(texts));
    }

    public static String longestCommonPrefix(String[] texts){

        Arrays.sort(texts);
        System.out.println(Arrays.toString(texts));

        return "";
    }
}
