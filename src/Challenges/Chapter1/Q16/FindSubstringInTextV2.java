// Write a program that checks if the given string contains the given substring.

package Challenges.Chapter1.Q16;

public class FindSubstringInTextV2 {
    public static void main(String[] args){
        String text = "My high school, the Illinois Mathematics and Science Academy, "
                + "showed me that anything is possible and that you're never too young to think big. "
                + "At 15, I worked as a computer programmer at the Fermi National Accelerator Laboratory, "
                + "or Fermilab. After graduating, I attended Stanford for a degree in economics and "
                + "computer science.";

        String textToSearchFor = "programmer";

        System.out.println(findSubstringInText(text, textToSearchFor));
    }

    public static boolean findSubstringInText(String text, String textToSearchFor) {
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == textToSearchFor.charAt(0)){
                String newText = text.substring(i);
                int endIndex = newText.indexOf(' ');
                if(newText.substring(0, endIndex).equalsIgnoreCase(textToSearchFor)){
                    return true;
                }
            }
        }
        return false;
    }
}
