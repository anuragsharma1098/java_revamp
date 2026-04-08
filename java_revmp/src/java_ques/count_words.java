package java_ques;

public class count_words {
    public static void main(String[] args) {
        String str = "Hello World! This is a Java program.";
        int wordCount = countWords(str);
        System.out.println("Number of words: " + wordCount);
    }

    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
}
