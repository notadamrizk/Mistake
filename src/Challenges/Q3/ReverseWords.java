package Challenges.Q3;

public class ReverseWords {
    public static void main(String[] args) {
        String text = "Hello world, today I am going to reverse the words in this sentence";

       for(int i = text.length() - 1; i >=0; i--){
           System.out.print(text.charAt(i));
       }
    }


}
