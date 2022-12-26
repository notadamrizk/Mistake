package Challenges.Q10;

import java.util.ArrayList;
import java.util.Collections;

public class Q10V3 {
    public static void main(String[] args) {
        getAndPrintAllPresentationsOfStrings("abcd");
    }

    public static void getAndPrintAllPresentationsOfStrings(String str){
        ArrayList<Character> listOfLetters = new ArrayList<>();
        for(int i = 0; i < str.length(); i++)
            listOfLetters.add(str.charAt(i));


        for(int i = 0; i < str.length(); i++){
            char temp = str.charAt(i);
            int indexOfTemp = listOfLetters.indexOf(temp);

            listOfLetters.remove(indexOfTemp);
            for(int j = 0; j < listOfLetters.size(); j++){
               if(j != 0 ){
                   Collections.swap(listOfLetters, j, j-1);
               }
                System.out.print(temp);
                printArrayList(listOfLetters);
                System.out.print(" ");
            }

            listOfLetters.add(0, temp);
            System.out.println();

        }
    }

    public static void printArrayList(ArrayList<Character> characterArrayList){
        for(int i = 0; i < characterArrayList.size(); i++)
            System.out.print(characterArrayList.get(i));
    }
}
