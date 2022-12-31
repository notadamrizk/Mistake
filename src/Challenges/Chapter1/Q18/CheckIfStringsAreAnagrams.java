package Challenges.Chapter1.Q18;

import java.util.Arrays;
import java.util.Collections;

public class CheckIfStringsAreAnagrams {

    private static final String TEXT1 = "hello world";
    private static final String TEXT2 = "dh\n le rlo l wo";

    public static void main(String[] args) {
        System.out.println(isAnagram(TEXT1, TEXT2));
    }

    public static boolean isAnagram(String text1, String text2){

        char[] array1 = text1.toLowerCase().replaceAll("\\s", "").toCharArray();
        char[] array2 = text2.toLowerCase().replaceAll("\\s", "").toCharArray();


        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);

    }
}
