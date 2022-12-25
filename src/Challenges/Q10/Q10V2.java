package Challenges.Q10;

import java.util.ArrayList;

public class Q10V2 {
    public static void main(String[] args) {
        getAndPrintAllPresentationsOfStrings("abc");
    }

    public static void getAndPrintAllPresentationsOfStrings(String str){
        int length = str.length();

        ArrayList<Integer> numbers_to_multiply = new ArrayList<>();
        for(int i = length; i > 1; i--)
            numbers_to_multiply.add(i);

        double number_of_permutations = multiply(numbers_to_multiply);

        for(int i = 0; i < number_of_permutations; i++){
            for(int index = 0; index < str.length(); index++){

            }
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
