package Challenges.Chapter1.Q12;

import java.util.ArrayList;

public class RemoveDuplicateChars {
    public static void main(String[] args) {
        System.out.println("No duplicate characters allowed!");
        final String text = "!ABCBA;C D E-D  D  DFA;";

        System.out.println("Original text: " + text);
        System.out.println("Text without duplicates: " + removeDuplicateChars(text));
    }

    public static String removeDuplicateChars(String text){


        if(text.isEmpty())
            return "";
        else {
            ArrayList<Character> characters = new ArrayList<>();
            for(int i = 0; i < text.length(); i++){
                if(!characters.contains(text.charAt(i))){
                    characters.add(text.charAt(i));
                }
            }

            return printArrayList(characters);
        }
    }

    public static String printArrayList(ArrayList<Character> list){
        String finalProduct = "";

        for(int i = 0; i < list.size(); i++)
            finalProduct += list.get(i);

        return finalProduct;
    }
}
