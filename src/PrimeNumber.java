import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        int n = key.nextInt();
        System.out.println(isPrime(n));

    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
//n = 3, 3 <= 1 does not work, 2 * 2 <= 3 false,