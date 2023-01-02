package Challenges.Chapter1.Q22.Tests;

import java.util.Arrays;

public class LongestCommonPrefix {
    private static String[] texts = {"abc", "abcd", "abcde", "ab", "abcd", "abcdef"};
    private static String[] texts2 = {"geeksforgeeks", "geeks", "geek", "geezer"};
    private static String[] texts3 = {"apple", "ape", "april"};
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(texts2));
    }

    public static String longestCommonPrefix(String[] texts){
        Arrays.sort(texts);

        String longest_prefix = texts[texts.length - 1];
        int[] count = new int[longest_prefix.length()];

        for(int i = 0; i < texts.length; i++){
            for(int j = 0; j < texts[i].length(); j++){
                count[texts[i].indexOf(texts[i].charAt(j))]++;
            }
        }
        int i;
        if(!(count[0] > count[1])){
            i = 0;
            while(count[i] == count[i+1]){
                i += 2;
            }
        } else{
            i = 1;
        }

        System.out.println(Arrays.toString(count));

        return texts[longest_prefix.length()-1].substring(0, i);


    }
}
