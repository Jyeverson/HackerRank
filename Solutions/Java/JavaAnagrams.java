import java.util.Scanner;

public class JavaAnagrams {
    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        a = a.replaceAll("[^a-z]", "");
        b = b.replaceAll("[^a-z]", "");

        if (a.length() != b.length()) {
            return false;
        }
        int[] charCount = new int[26];

        for (char c : a.toCharArray()) {
            int index = c - 'a';
            charCount[index]++;
        }

        for (char c : b.toCharArray()) {
            int index = c - 'a';
            charCount[index]--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
