import java.util.Scanner;

public class JavaRegex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            String IP = sc.next();
            System.out.println(MyRegex(IP));
        }
    }

    private static boolean MyRegex(String ipAddress){
        String ipPattern = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}$";
        return ipAddress.matches(ipPattern);
    }

}
