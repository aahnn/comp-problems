import java.util.*;

public class ThePartyAndTheSweets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long[] b = new long[n];
        long[] g = new long[m];

        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }
        for (int j = 0; j < m; j++) {
            g[j] = in.nextInt();
        }

        Arrays.sort(b);
        Arrays.sort(g);

        if (b[n - 1] > g[0]) {
            System.out.println(-1);
            return;
        }

        long sweets = 0;

        sweets += b[n - 1];
        if (b[n - 1] == g[0]) {
            sweets += b[n - 2];
        } else {
            sweets += g[0];
        }
        for (int j = 1; j < m; j++) {
            sweets += g[j];
            sweets += b[n - 2];
        }

        for (int i = n - 3; i >= 0; i--) {
            sweets += b[i] * m;
        }

        System.out.println(sweets);
    }
}
