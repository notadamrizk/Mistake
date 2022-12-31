package Challenges.Chapter1.Q21;

public class RemoveTrailingAndLeadingSpace {


    public static void main(String[] args) {
        String text = "        Hello World         ";
        String textWithoutTrailingAndLeadingSpace = "";

        System.out.println(text.trim());
        int i = 0;
        while(text.charAt(i) == ' '){
            i++;
        }

        textWithoutTrailingAndLeadingSpace = text.substring(i);

        int j = textWithoutTrailingAndLeadingSpace.length() - 1;
        while(textWithoutTrailingAndLeadingSpace.charAt(j) == ' '){
            j--;
        }

        textWithoutTrailingAndLeadingSpace = textWithoutTrailingAndLeadingSpace.substring(0, j + 1);

        System.out.println(textWithoutTrailingAndLeadingSpace);

    }
}
