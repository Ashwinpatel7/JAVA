import java.util.Arrays;
import java.util.Scanner;

public class PrimeTriplet {
    public static boolean[] sieveOfEratosthenes(int limit) {
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);

        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        return isPrime;
    }

    public static String findPrimeTriplet(int N) {
        boolean[] isPrime = sieveOfEratosthenes(N);

        for (int a = 2; a < N; a++) {
            for (int b = a + 1; b < N; b++) {
                int c = N - a - b;
                if (c > b && isPrime[a] && isPrime[b] && isPrime[c]) {
                    return "Yes";
                }
            }
        }
        return "No";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int N = scanner.nextInt();

        // Output
        String result = findPrimeTriplet(N);
        System.out.println(result);

        scanner.close();
    }
}
