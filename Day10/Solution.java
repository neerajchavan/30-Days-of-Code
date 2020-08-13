import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int max = 0, count = 0;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

       while(n>0)
       {
        int reminder = n % 2;
        n = n / 2;
        if(reminder == 1){
            count++;
            if(max<=count)
            max = count;
        }

        else
           count = 0;
       }

       System.out.print(max);


        scanner.close();
    }
}
