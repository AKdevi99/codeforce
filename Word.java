import java.util.*;

public class Word {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(wordConversion(input));
    }

    public static String wordConversion(String str) {
        int upperCount = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                upperCount++;
            }
        }

        if (upperCount > str.length() / 2) {
            return str.toUpperCase();
        } else {
            return str.toLowerCase();
        }
    }
}
