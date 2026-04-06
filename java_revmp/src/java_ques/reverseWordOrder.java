package java_ques;

public class reverseWordOrder {
    public static void main(String[] args) {
        String str = "Hello World";
        String[] words = str.split(" ");
        StringBuilder reversedStr = new StringBuilder();
        reverseWordOrderSimple(str);

        for (int i = words.length - 1; i >= 0; i--) {
            reversedStr.append(words[i]).append(" ");
        }

        System.out.println(reversedStr.toString().trim());
    }

    // simplest way using for loop without using StringBuilder
    public static void reverseWordOrderSimple(String str) {
        String[] words = str.split(" ");
        String reversedStr = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reversedStr += words[i] + " ";
        }

        System.out.println(reversedStr.trim());
    }
}
