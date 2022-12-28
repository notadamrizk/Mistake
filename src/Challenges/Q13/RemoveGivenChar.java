package Challenges.Q13;

import java.util.Scanner;

public class RemoveGivenChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = "Obama is fake and Jesus is real.";
        System.out.println(text);
        System.out.print("What char would you like to remove? ");
        char charToRemove = input.next().charAt(0);

        System.out.println(removeGivenChar(text, charToRemove));
    }

    public static String removeGivenChar(String text, char charToRemove){
        if(text.isEmpty()){
            return "";
        }

        char[] chars = text.toCharArray();
        String newString = "";
        for(char c : chars){
            if(c != charToRemove)
                newString += Character.toString(c);
        }

        return newString;
    }
}
