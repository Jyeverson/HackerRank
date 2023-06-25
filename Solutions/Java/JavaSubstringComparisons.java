import java.util.Scanner;

public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = smallest;

        for (int i = k; i < s.length(); i++) {
            String substring = s.substring(i - k + 1, i + 1);
            if (substring.compareTo(smallest) < 0) {
                smallest = substring;
            } else if (substring.compareTo(largest) > 0) {
                largest = substring;
            }
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
