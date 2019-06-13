import java.util.*;

public class HeroToZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            long n = in.nextLong();
            long k = in.nextLong();
            long numMoves = 0;
            while (n > 0) {
                if (n % k == 0) {
                    n /= k;
                    numMoves++;
                }
                else {
                    long mod = n % k;
                    n -= mod;
                    numMoves += mod;
                }
            }

            System.out.println(numMoves);
        }
    }
}
