package Challenges.Chapter1.Q4;

public class OnlyHasDigits {
    public static void main(String[] args) {
        String only_digits = "2311239213924845301309213045172302313921380412";
        String not_only_digits = "2132138231e13e0i92109312901209308123u812030u4918e";

        System.out.println(isDigits(only_digits));
        System.out.println(isDigits(not_only_digits));
    }

    public static boolean isDigits(String text){
        for(int i = 0; i < text.length(); i++){
            if(!Character.isDigit(text.charAt(i))){
                return false;
            }
        }

        return true;
    }

}
