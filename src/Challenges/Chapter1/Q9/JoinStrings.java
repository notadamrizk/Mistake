package Challenges.Chapter1.Q9;

public class JoinStrings {
    private static final String TEXT_1 = "Illinois";
    private static final String TEXT_2 = "Mathematics";
    private static final String TEXT_3 = "and";
    private static final String TEXT_4 = "Science";
    private static final String TEXT_5 = "Academy";

    public static void main(String[] args) {
        String joinedString = String.join(" " , TEXT_1, TEXT_2, TEXT_3, TEXT_4, TEXT_5);
        System.out.println(joinedString);
    }
}
