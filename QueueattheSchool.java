import java.util.*;

public class QueueattheSchool {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        String str = sc.next();

        char[] arr = str.toCharArray();

        while (k-- > 0) {
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] == 'B' && arr[i] == 'G') {
                    char temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    i++; // skip next position
                }
            }
        }

        System.out.println(new String(arr));
    }
}
