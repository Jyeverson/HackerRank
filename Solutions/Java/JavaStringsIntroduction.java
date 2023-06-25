import java.util.Scanner;

public class JavaStringsIntroduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        System.out.println(a.length() + b.length());
        System.out.println(a.compareTo(b) > 0 ? "Yes" : "No");
        System.out.println(a.substring(0, 1).toUpperCase() + a.substring(1, a.length()) + " "
                + b.substring(0, 1).toUpperCase() + b.substring(1, b.length()));
        sc.close();
    }
}
