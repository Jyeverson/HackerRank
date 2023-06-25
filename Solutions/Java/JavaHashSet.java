import java.util.HashSet;
import java.util.Scanner;

public class JavaHashSet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        HashSet<String> values = new HashSet<String>();
        for (int j = 0; j < pair_left.length; j++) {
            String pair = pair_left[j] + " " + pair_right[j];

            values.add(pair);
            System.out.println(values.size());

        }
        s.close();
    }
}