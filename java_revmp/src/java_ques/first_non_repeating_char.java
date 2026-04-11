package java_ques;

public class first_non_repeating_char {
    public static void main(String[] args) {
        String str = "swiss";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if first and last occurrence are same
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("First non-repeating character: " + ch);
                return;
            }
        }

        System.out.println("No non-repeating character found");
    }
}