package Challenges.Chapter1.Q22.Tests;

public class Test5 {
    public static void main(String[] args) {
        String[] texts = {"abc", "abcd", "abcde", "ab", "abcd", "abcdef"};

        System.out.println(allLettersAreTheSameInEachString(texts, 5));
    }

    public static boolean allLettersAreTheSameInEachString(String[] list, int index){
        char letter = list[list.length - 1].charAt(index);

        for(int i = 0; i < list.length; i++){
            String currentWord = list[i];
            if(index > currentWord.length() || currentWord.charAt(index) != letter){
                return false;
            }
        }

        return true;
    }
}
