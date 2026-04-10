package java_ques;

public class find_duplicate {
    public static void main(String[] args) {
        String str = "hello world";
        findDuplicate(str);
    }

    public static void findDuplicate(String str) {
        int[] count = new int[256];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        System.out.println("Duplicate characters in the string:");
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 1) {
                System.out.println((char) i + ": " + count[i] + " times");
            }
        }
    }
}
