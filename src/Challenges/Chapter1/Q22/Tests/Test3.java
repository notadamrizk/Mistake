package Challenges.Chapter1.Q22.Tests;

import java.util.Arrays;

public class Test3 {

    private static String[] texts = {"abc", "abcd", "abcde", "ab", "abcd", "abcdef"};

    public static void main(String[] args) {

        String word = "RASPBERRY";
        int count[] = new int[word.length()];

        char letter = 'R';
        int start = word.indexOf(letter);

        while(start != -1) {
            System.out.println("Found R in: " + start);
            count[start]++;
            start = word.indexOf(letter, ++start);
        }

        System.out.println(Arrays.toString(count));
    }
}
