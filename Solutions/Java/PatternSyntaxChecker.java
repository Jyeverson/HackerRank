import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            String regex = sc.nextLine();
            if(isValidRegex(regex)) {
                System.out.println("Valid");
                continue;
            }
            System.out.println("Invalid");
        }
        sc.close();
    }

    public static Boolean isValidRegex(String regex){

        try{
            Pattern.compile(regex);
            return true;
        } catch (PatternSyntaxException ex) {
            return false;
        }
    }
}
