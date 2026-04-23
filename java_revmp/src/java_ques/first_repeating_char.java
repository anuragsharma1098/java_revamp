package java_ques;

public class first_repeating_char {
    public static void main(String[] args) {
        String str = "hello world";
        char result = findFirstRepeatingChar(str);
        if (result != '\0') {
            System.out.println("First repeating character: " + result);
        } else {
            System.out.println("No repeating characters found.");
        }
    }

    public static char findFirstRepeatingChar(String str) {
        int[] charCount = new int[256]; // Assuming ASCII character set

        for (char c : str.toCharArray()) {
            charCount[c]++;
            if (charCount[c] == 2) { // First time we see a repeat
                return c;
            }
        }
        return '\0'; // Return null character if no repeating character is found
    }
}
