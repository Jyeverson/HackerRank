import java.util.*;
public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        s = removeLeadingNonLetters(s);

        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }

        String[] words = s.split("[^a-zA-Z]+");
        System.out.println(words.length);

        for (String word : words) {
            System.out.println(word);
        }
        sc.close();
    }

    private static String removeLeadingNonLetters(String str) {
        int i;
        for (i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                break;
            }
        }
        return str.substring(i);
    }
}
