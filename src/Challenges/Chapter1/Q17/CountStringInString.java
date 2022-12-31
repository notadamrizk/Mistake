package Challenges.Chapter1.Q17;

public class CountStringInString {
    private static final String STRING = "431111ja1111ewew11e";
    private static final String SUBSTRING = "11";


    public static void main(String[] args) {
        System.out.println(countStringInString(STRING, SUBSTRING));
    }

    public static int countStringInString(String text, String substring){
        if(text.isEmpty() || substring.isEmpty()){
            throw new IllegalArgumentException("Text or substring can not be empty");
        }

        int count = 0;

        for(int i = 0; i < text.length(); i+= substring.length()){
            if(i + substring.length() > text.length() ){
                if(text.charAt(i) == substring.charAt(0) && substring.length() == 1)
                    ++count;
            } else if(text.startsWith(substring, i)){
                count++;
            }


        }

        return count;
    }
}
