package Challenges.Chapter1.Q11;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word to see if it's a palindrome: ");

        if(isPalindrome(input.nextLine())){
            System.out.println("This word is a palindrome");
        } else {
            System.out.println("This word is not a palindrome");
        }
    }

    public static boolean isPalindrome(String word){
        String reverse_word = "";
        for(int i = word.length() - 1; i >= 0; i--){
            reverse_word += Character.toString(word.charAt(i));
        }

        return reverse_word.equalsIgnoreCase(word);
    }
}
