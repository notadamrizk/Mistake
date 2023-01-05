package Challenges;

import java.util.ArrayList;
import java.util.Scanner;

public class ACSLChallengeV2 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        // 45 2 1111011
        int n = 20;
        int b = 3;
        int s = 12;

        ArrayList<Integer> bannedNumbers = new ArrayList<>();
        ArrayList<Long> allValues = new ArrayList<>();
        for (int i = b; i < 10; i++) {
            bannedNumbers.add(i);
        }



        long value = s;
        for(int i = 0; i < n; i++){
            if(containsBannedNumber(bannedNumbers, value)){
                while(containsBannedNumber(bannedNumbers, value)){
                    value++;
                }
            } else if (containsBannedNumber(bannedNumbers, value + 1)){
               value++;
                while(containsBannedNumber(bannedNumbers, value)){
                    value++;
                }
            } else {
                value++;
            }

            allValues.add(value);
        }

        int largestNumber = b - 1;
        int largestNumberCount = 0;
        for(long number : allValues){
            String numberAsString = String.valueOf(number);
            for(int j = 0; j <  numberAsString.length(); j ++){
                if(Integer.parseInt(String.valueOf(numberAsString.charAt(j))) == largestNumber){
                    largestNumberCount++;
                }
            }

        }

        System.out.println(largestNumberCount);

    }

    public static boolean containsBannedNumber( ArrayList<Integer> bannedNumber, long value){
        String valueAsString = String.valueOf(value);

        for(int i = 0; i < valueAsString.length(); i++){
            if(bannedNumber.contains(Integer.parseInt(String.valueOf(Integer.parseInt(Character.toString(valueAsString.charAt(i)))))))
                return true;
        }
        return false;

    }
}
