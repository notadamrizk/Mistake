package Challenges.Q8;

public class RemoveAllWhiteSpaces {
    public static void main(String[] args) {
        String text = "Hello world, this program remvoes all space..";

       text = text.replaceAll(" ", "");



        System.out.println(text);
    }
}
