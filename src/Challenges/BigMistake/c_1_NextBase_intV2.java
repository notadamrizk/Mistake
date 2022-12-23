package Challenges.BigMistake;

import java.io.IOException;
import java.util.ArrayList;

public class c_1_NextBase_intV2 {
    public static void main(String[] args) throws IOException {
       // Scanner file = new Scanner(new File("inputJC1.txt"));

        // while (file.hasNextLine()) {
        //long n = file.nextLong(), b = file.nextLong(), s = file.nextLong();
        long n = 20, b = 3, s = 21;
        ArrayList<Long> numbers = new ArrayList<>();
        ArrayList<Character> allowedDigits = new ArrayList<>();

        for(int digit = 0; digit < b; digit++){
            allowedDigits.add((char)digit);
        }

        numbers.add(s);
        for (int i = 1; i < n; i++) {
            long current_number = numbers.get(i - 1);
            String number = "" + current_number;
            for(int j = 0; j < number.length(); j++) {
                for (int index = 0; index < allowedDigits.size(); index++)
                    if (number.charAt(j) == allowedDigits.get(index)) {
                        current_number++;
                    }
            }
            numbers.add(current_number);
        }

        int number_of_highest_digit_number = 0;
        for (long number : numbers) {
            if (number % 10 == b - 1) {
                number_of_highest_digit_number++;
            }
        }

        System.out.println(numbers);
        System.out.println(number_of_highest_digit_number);
    }
}

//
//}
