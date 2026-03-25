package java_ques;

public class string_reverse {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String reversedStr = reverseString(str);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
        // using inbuilt method
        String reversedStrInbuilt = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed String using inbuilt method: " + reversedStrInbuilt);
    }

    // Method to reverse a string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
