package java_ques;

public class remove_digits_from_string {
    public static void main(String[] args) {
        String str = "a1b2c3d4e5f6g7h8i9j0";
        String result = removeDigits(str);
        System.out.println(result); // Output: abcdefghij
    }

    public static String removeDigits(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (!Character.isDigit(ch)) {
                sb.append(ch);
            }
        }
        return sb.toString();  
    }
}
