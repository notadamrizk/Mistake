package Challenges;

import java.util.Scanner;

public class ACSLChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 15, b = 2, s = 1;

        long result = s;
        int count = 0;
        int largestNumber = b -1;
        for(int i = 0; i < n; i++) {
            System.out.println(result);
            result++;
            if(result % 10 == b ){
               result += 10 - b;
            }
        }

    }


}
