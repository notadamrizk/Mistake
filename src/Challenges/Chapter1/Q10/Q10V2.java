package Challenges.Chapter1.Q10;

import java.util.ArrayList;

public class Q10V2 {
    public static void main(String[] args) {
        getAndPrintAllPresentationsOfStrings("abc");
    }

    public static void getAndPrintAllPresentationsOfStrings(String str){
        int length = str.length();
        ArrayList<Character> listOfLetters = new ArrayList<>();

        for(int i = 0; i < str.length(); i++)
            listOfLetters.add(str.charAt(i));
        System.out.println(listOfLetters);

        System.out.println();
        ArrayList<Integer> numbers_to_multiply = new ArrayList<>();
        for(int i = length; i > 1; i--)
            numbers_to_multiply.add(i);

        double number_of_permutations = multiply(numbers_to_multiply);

        for(int i = 0; i < number_of_permutations; i++){

        }
    }

    public static int multiply(ArrayList<Integer> list){
        int total = 1;
        for(int i = 0; i < list.size(); i++){
            int current_numb = list.get(i);
            total *= current_numb;
        }

        return total;
    }

}
