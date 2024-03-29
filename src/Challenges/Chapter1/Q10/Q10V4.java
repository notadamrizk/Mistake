package Challenges.Chapter1.Q10;

public class Q10V4 {
    public static void main(String[] args) {

        permuteAndPrint("", "abc");
    }
    private static void permuteAndPrint(String prefix, String str) {

        int n = str.length();
        if (n == 0) {
            System.out.print(prefix + " ");
        } else {
            for (int i = 0; i < n; i++) {
                permuteAndPrint(prefix + str.charAt(i),
                        str.substring(i + 1, n) + str.substring(0, i));
            }
        }
    }

}
