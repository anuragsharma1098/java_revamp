package java_ques;

public class remove_special_chars {
    public static void main(String[] args) {

        // method 1: Using replaceAll() method with regex
        String str = "Hello@World#2024!";
        String result = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("Original String: " + str);
        System.out.println("String after removing special characters: " + result);

        // method 2: Using StringBuilder to construct a new string without special
        // characters
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }
        String result2 = sb.toString();
        System.out.println("String after removing special characters using StringBuilder: " + result2);

        // method 3: without using built-in methods
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
                sb2.append(c);
            }
        }
        String result3 = sb2.toString();
        System.out.println("String after removing special characters without using built-in methods: " + result3);
    }
}
