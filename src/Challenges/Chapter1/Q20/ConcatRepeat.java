package Challenges.Chapter1.Q20;

import java.util.Scanner;

public class ConcatRepeat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        System.out.print("Enter number of times to repeat the text: ");
        int times = scanner.nextInt();

        System.out.println(concatRepeat(text, times));
    }

    public static String concatRepeat(String text, int times){
        String total = "";
        for(int i = 1; i <= times; ++i){
            total += text;
        }
        return total;
    }
}
