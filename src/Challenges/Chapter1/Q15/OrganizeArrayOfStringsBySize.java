package Challenges.Chapter1.Q15;

import java.util.Arrays;

public class OrganizeArrayOfStringsBySize {
    public static void main(String[] args) {
        String[] arrayOfWords = {"Hello", "Ask", "Test", "Threat", "Because"};
        sort(arrayOfWords);
        System.out.println(Arrays.toString(arrayOfWords));
    }

    public static void sort(String[] arrayOfWords){
        for(int i = 0; i < arrayOfWords.length; i++){
            for(int j = i + 1; j < arrayOfWords.length; j++){

                if(arrayOfWords[i].length() > arrayOfWords[j].length()){
                    String temp = arrayOfWords[i];
                    arrayOfWords[i] = arrayOfWords[j];
                    arrayOfWords[j] = temp;

                }
            }
        }
    }

}
