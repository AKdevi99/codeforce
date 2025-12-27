import java.util.*;

public class BeautifulMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(calculateNext(year));
    }

    public static int calculateNext(int year) {

        int nextYear = year + 1;

        while (true) {
            HashSet<Integer> set = new HashSet<>();
            int temp = nextYear;
            boolean unique = true;

            while (temp > 0) {
                int digit = temp % 10;

                if (set.contains(digit)) {
                    unique = false;
                    break;
                }

                set.add(digit);
                temp /= 10;
            }

            if (unique) {
                return nextYear;
            }

            nextYear++;
        }
    }
}
