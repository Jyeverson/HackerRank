import java.io.*;
import java.util.*;

public class JavaAnagrams {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        char[] c = a.toLowerCase().toCharArray();
        char[] d = b.toLowerCase().toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);

        if(Arrays.equals(c, d)){
            System.out.println("Anagrams");
        }
        else {
            System.out.println("Not Anagrams");
        }
        scan.close();
    }
}