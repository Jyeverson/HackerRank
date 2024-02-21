import java.io.*;
import java.math.*;

public class JavaPrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger result = new BigInteger(n);
        if (result.isProbablePrime(100)) {
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }
        bufferedReader.close();
    }

}