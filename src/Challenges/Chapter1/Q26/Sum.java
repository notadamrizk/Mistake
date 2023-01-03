package Challenges.Chapter1.Q26;

import java.util.function.BinaryOperator;

public class Sum {
    public static void main(String[] args) {
        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;
        int z = x + y;
        System.out.println(x + " + " + y + " via '+' operator is: " + z);


        int zSum = Integer.sum(x, y);
        System.out.println(x + " + " + y + " via Integer.sum() is: " + zSum);
    }
}
