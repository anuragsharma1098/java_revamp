package java_ques;

public class reverse_nth_word {
    public static void main(String[] args) {
        String str = "Hello World from Java";
        int n = 2; // Reverse the 2nd word
        String result = reverseNthWord(str, n);
        String resultLoop = reverseNthWordLoop(str, n);
        System.out.println(result); // Output: Hello dlroW from Java
        System.out.println(resultLoop); // Output: Hello dlroW from Java
    }

    // using reverse method of StringBuilder class
    public static String reverseNthWord(String str, int n) {
        String[] words = str.split(" ");
        if (n > 0 && n <= words.length) {
            String wordToReverse = words[n - 1];
            String reversedWord = new StringBuilder(wordToReverse).reverse().toString();
            words[n - 1] = reversedWord;
        }
        return String.join(" ", words);
    }
    
    // using loop
    public static String reverseNthWordLoop(String str, int n) {
        String[] words = str.split(" ");
        if (n > 0 && n <= words.length) {
            String wordToReverse = words[n - 1];
            StringBuilder reversedWord = new StringBuilder();
            for (int i = wordToReverse.length() - 1; i >= 0; i--) {
                reversedWord.append(wordToReverse.charAt(i));
            }
            words[n - 1] = reversedWord.toString();
        }
        return String.join(" ", words);
    }
}
