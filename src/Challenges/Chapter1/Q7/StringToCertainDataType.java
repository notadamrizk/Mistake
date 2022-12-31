package Challenges.Chapter1.Q7;

public class StringToCertainDataType {
    private static final String TO_INT = "453";
    private static final String TO_LONG = "45234223233";
    private static final String TO_FLOAT = "45.823F";
    private static final String TO_DOUBLE = "13.83423D";

    private static final String TO_INT_NEGATIVE = "-453";
    private static final String TO_LONG_NEGATIVE = "-45234223233";
    private static final String TO_FLOAT_NEGATIVE = "-45.823F";
    private static final String TO_DOUBLE_NEGATIVE = "-13.83423D";

    public static void main(String[] args) {

        Float toFloat = Float.valueOf(TO_FLOAT);
        System.out.println(toFloat);
    }
}
