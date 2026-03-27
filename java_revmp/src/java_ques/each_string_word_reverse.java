package java_ques;

public class each_string_word_reverse {
    public static void main(String[] args) {

        // method 1
        String str = "Hello, World!";
        String reversedWordsStr = reverseEachWord(str);
        System.out.println("Original String: " + str);
        System.out.println("Reversed Each Word String: " + reversedWordsStr);
    }

    // Method to reverse each word in a string
    public static String reverseEachWord(String str) {
        String[] words = str.split(" ");
        StringBuilder reversedString = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversedString.append(reversedWord).append(" ");
        }

        return reversedString.toString().trim();
    }

    // method 2 without reverse()
    public static String reverseEachWordManual(String str) {
        String[] words = str.split(" ");
        StringBuilder reversedString = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder();
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord.append(word.charAt(i));
            }
            reversedString.append(reversedWord).append(" ");
        }

        return reversedString.toString().trim();
    }

}
