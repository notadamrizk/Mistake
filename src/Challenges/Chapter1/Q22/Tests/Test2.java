package Challenges.Chapter1.Q22.Tests;

import java.util.Arrays;

public class Test2 {

    static void sort(String []s, int n)
    {
        for (int i=1 ;i<n; i++)
        {
            String temp = s[i];

            // Insert s[j] at its correct position
            int j = i - 1;
            while (j >= 0 && temp.length() < s[j].length())
            {
                s[j+1] = s[j];
                j--;
            }
            s[j+1] = temp;
        }
    }

    public static void main(String[] args) {
        String word = "RASPBERRY";


        String[] texts = {"geeksforgeeks", "geeks", "geek", "geezer"};
        //String[] texts = {"abc", "abcd", "abcde", "ab", "abcd", "abcdef"};
        Arrays.sort(texts);
        int count[] = new int["geeksforgeeks".length()];


        for (int i = 0; i < texts.length; i++) {
            String current_word = texts[i];
            for (int j = 0; j < current_word.length(); ++j) {
                char letter = current_word.charAt(j);
                int start = word.indexOf(letter);

                while(start != -1) {
                    System.out.println("Found R in: " + start);
                    count[start]++;
                    start = word.indexOf(letter, ++start);
                }
            }
        }

        System.out.println(Arrays.toString(count));
    }
}
