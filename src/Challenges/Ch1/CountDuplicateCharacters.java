package Challenges.Ch1;

import java.util.ArrayList;
import java.util.Scanner;

public class CountDuplicateCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter text to find the individual word count.");
        String text = input.nextLine();
        text = text.toLowerCase();

        ArrayList<Character> charactersList = new ArrayList<>();
        ArrayList<Integer> numberOfCharacters = new ArrayList<>();

        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) != ' ' && !charactersList.contains(text.charAt(i))){
                charactersList.add(text.charAt(i));
            }
        }

        for(int i = 0; i < charactersList.size(); i++){
            numberOfCharacters.add(0);
        }

        for(int index = 0; index < text.length(); index++){
            char current_letter = text.charAt(index);
            int current_index = charactersList.indexOf(current_letter);

            if(current_index != -1){
                numberOfCharacters.set(current_index, numberOfCharacters.get(current_index) + 1);
            }
        }

        for(int i = 0; i < charactersList.size(); i++){
            System.out.print(charactersList.get(i) + "-" + numberOfCharacters.get(i) + " ");
        }
    }

}
