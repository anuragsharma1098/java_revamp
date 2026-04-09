package java_ques;

import java.util.*;

public class remove_whitespace {
    public static String removeWhitespace(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with whitespace: ");
        String input = scanner.nextLine();
        String output = removeWhitespace(input);
        System.out.println("String after removing whitespace: " + output);
        System.out.println("String after removing whitespace (simple method): " + removeWhitespaceSimple(input));
        scanner.close();
    }

    // simplest method // return str.replaceAll("\\s", "");
    public static String removeWhitespaceSimple(String str) {
        return str.replaceAll("\\s", "");
    }

}
