package Challenges.Q6;

import java.util.Locale;
import java.util.Scanner;

public class CountCertainChars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char letterToLookFor = getLetter(input);
        int count = 0;

        System.out.println("Enter text");
        String text = input.nextLine().toLowerCase(Locale.ROOT);

        for(int i = 0; i < text.length(); i++){
            if(letterToLookFor == text.charAt(i))
                count++;
        }

        System.out.println("The letter appeared " + count + " times.");

    }

    public static char getLetter(Scanner input){
        System.out.println("Enter a character to search for");
        return input.nextLine().charAt(0);
    }
}
