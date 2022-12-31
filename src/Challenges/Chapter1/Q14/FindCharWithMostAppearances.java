package Challenges.Chapter1.Q14;

import java.util.Locale;

public class FindCharWithMostAppearances {
    public static void main(String[] args) {
        String text = "What character has the highest count in this text?";
        text = text.toLowerCase(Locale.ROOT);
        System.out.println(findCharWithMostAppearances(text));
    }

    public static char findCharWithMostAppearances(String text){

        int maxCharCount = 0;
        char mostFrequentChar = text.charAt(0);

        for(int i = 0; i < text.length(); ++i){
            char currentChar = text.charAt(i);
            int count = 0;

            if(!Character.isWhitespace(currentChar)){ // ignores whitespaces
                for(int j = 0; j < text.length(); j++){
                    if(text.charAt(j) == currentChar) {
                        count++;
                    }
                }
            }

            if(count > maxCharCount){
                maxCharCount = count;
                mostFrequentChar = currentChar;
            }
        }
        return mostFrequentChar;
    }
}
