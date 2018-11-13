import java.util.*;

public class DivisorSubtraction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();

        long numSub = 0;

        while (n != 0) {
            if (n % 2 == 0) {
                System.out.println(n / 2 + numSub);
                System.exit(0);
            }
            long d = smallestPrimeDivisor(n);
            n -= d;
            numSub++;
        }

        System.out.println(numSub);
    }

    private static long smallestPrimeDivisor(long n) {
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return i;
            }
        }
        return n;
    }
}
