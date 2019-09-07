import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class sockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> socks = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (socks.containsKey(ar[i])) {
                int newValue = socks.get(ar[i]) + 1;
                socks.replace(ar[i], newValue);
            }else {
                socks.put(ar[i], 1);
            }
        }

        int sum = 0;
        for (int i: socks.values()) {
            sum += i/2;
        }

        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        int[] ar = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = scanner.nextInt();
        }

        int result = sockMerchant(n, ar);
        System.out.print(result);
    }
}
