import java.io.*;
import java.util.*;

public class Java1dArray {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] myArray = new int[n];

        for(int i = 0; i < n; i++){
            myArray[i] = sc.nextInt();
        }

        for(int array : myArray){
            System.out.println(array);
        }

        sc.close();
    }

}
