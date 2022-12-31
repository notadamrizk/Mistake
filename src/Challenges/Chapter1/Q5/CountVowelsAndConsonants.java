package Challenges.Chapter1.Q5;

import java.util.ArrayList;
import java.util.Arrays;

public class CountVowelsAndConsonants {
    public static ArrayList<Character> vowels = new ArrayList<>();
    public static void main(String[] args) {
        vowels.add('a');
        vowels.add('e');
        vowels.add('u');
        vowels.add('o');
        vowels.add('i');

        // Index at 0 = vowels
        // Index at 1 = consonants
        int[] vowelsAndConsonantsCount = new int[2];
        String text = "Hello world";
        getVowelsAndConsonantsCount(vowelsAndConsonantsCount, text);

        System.out.println(Arrays.toString(vowelsAndConsonantsCount));
    }

    public static void getVowelsAndConsonantsCount(int[] vowelsAndConsonantsCount, String text){

        for(int i = 0; i < text.length(); i++) {
            if(vowels.contains(text.charAt(i))){
                vowelsAndConsonantsCount[0]++;
            } else if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z'){
                vowelsAndConsonantsCount[1]++;
            }
        }


    }
}
