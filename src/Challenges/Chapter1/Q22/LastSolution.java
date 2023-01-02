package Challenges.Chapter1.Q22;

import java.util.ArrayList;
import java.util.Arrays;

public class LastSolution {
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
        ArrayList<int[]> listOfArrays = new ArrayList<>();
        String[] texts = {"abc", "abcd", "abcde", "ab", "abcd", "abcdef"};
        // String[] texts = {"geeksforgeeks", "geeks", "geek", "geezer"};
        //String[] texts = {"apple", "ape", "april"};
        sort(texts, texts.length);
        for(int j = 0; j < texts.length; j++){
            String word = texts[j];
            int[] count = new int[word.length()];
            for(int i = 0; i < word.length(); ++i){
                if(word.charAt(i) != '_'){
                    char letter = word.charAt(i);
                    int start = word.indexOf(letter);
                    while(start != - 1){
                        System.out.println("Found " + letter +  " in: " + start);
                        System.out.println(start);
                        if(allLettersAreTheSameInEachString(texts, i)) {
                            count[start]++;
                        }
                        start = word.indexOf(letter, ++start);
                    }
                    word = word.replaceAll(Character.toString(letter), "_");
                    System.out.println(word);
                }
            }
            listOfArrays.add(count);
        }

        for(int i = 0; i < listOfArrays.size(); ++i){
            System.out.println(Arrays.toString(listOfArrays.get(i)));
        }

        int i = 0;
        while(listOfArrays.get(i)[i] == 1){
            i++;
        }
        System.out.println(i);

        System.out.println(texts[0].substring(0, i));
    }

    public static boolean allLettersAreTheSameInEachString(String[] list, int index){
        char letter = list[list.length - 1].charAt(index);

        for(int i = 0; i < list.length; i++){
            String currentWord = list[i];
            if(index >= currentWord.length() || currentWord.charAt(index) != letter){
                return false;
            }
        }

        return true;
    }
}
