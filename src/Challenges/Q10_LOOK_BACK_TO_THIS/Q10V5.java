package Challenges.Q10_LOOK_BACK_TO_THIS;

import java.util.ArrayList;
import java.util.Collections;

public class Q10V5 {
    public static void main(String[] args) {
        getAndPrintAllPresentationsOfStrings("abcd");
    }

    public static void getAndPrintAllPresentationsOfStrings(String str){
        ArrayList<Character> listOfLetters = new ArrayList<>();
        for(int i = 0; i < str.length(); i++)
            listOfLetters.add(str.charAt(i));



        double number_of_permutations = getNumberOfPermutations(str.length());

        System.out.println(number_of_permutations);

        for(int i = 0; i < listOfLetters.size(); i++){
            char temp = listOfLetters.get(i);
            int indexOfTemp = listOfLetters.indexOf(temp);
            listOfLetters.remove(listOfLetters.get(i));
            for(int j = 0; j < number_of_permutations / listOfLetters.size(); j++){
                System.out.print(temp);

                System.out.print(" ");
            }
            System.out.println();

            listOfLetters.add(indexOfTemp, temp);
        }
    }

    public static void printArrayList(ArrayList<Character> characterArrayList){
        for(int i = 0; i < characterArrayList.size(); i++)
            System.out.print(characterArrayList.get(i));
    }

    public static int getNumberOfPermutations(int length){
        int total = 1;
        for(int i = 1; i <= length; i++){
            total *= i;

        }
        return total;
    }

}
