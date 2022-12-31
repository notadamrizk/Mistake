package Challenges.Chapter1.Q2;

import java.util.ArrayList;
import java.util.Locale;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String text = "Hello let me tell you what it is like to be a zero";
        ArrayList<Character> charList = new ArrayList<>();
        ArrayList<Integer> wordCount = new ArrayList<>();

        text = text.toLowerCase(Locale.ROOT);
        for(int i = 0; i < text.length(); i++){
            if(!charList.contains(text.charAt(i)) && text.charAt(i) != ' '){
                charList.add(text.charAt(i));
            }

        }

        for(int i = 0; i < charList.size(); i++){
            wordCount.add(0);
        }


        for(int index = 0; index < text.length(); index++){
            char current_letter = text.charAt(index);
            int current_index = charList.indexOf(current_letter);

            if(current_index != -1){
                wordCount.set(current_index, wordCount.get(current_index) + 1);
            }
        }
        int first_index_of_1 = wordCount.indexOf(1);
        char first_non_repeated_char = charList.get(first_index_of_1);
        System.out.println(first_non_repeated_char);
    }
}
