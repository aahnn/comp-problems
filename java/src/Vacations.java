import java.util.*;

public class Vacations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int[][] dp = new int[n][3];
        if (a[0] == 1 || a[0] == 3) {
            dp[0][1] = 1;
        }
        if (a[0] == 2 || a[0] == 3) {
            dp[0][2] = 1;
        }

        for (int i = 1; i < n; i++) {
            if (a[i] == 1 || a[i] == 3) {
                dp[i][1] = 1 + Math.max(dp[i - 1][0], dp[i - 1][2]);
            }
            if (a[i] == 2 || a[i] == 3) {
                dp[i][2] = 1 + Math.max(dp[i - 1][0], dp[i - 1][1]);
            }
            dp[i][0] = Math.max(dp[i - 1][0], Math.max(dp[i - 1][1], dp[i - 1][2]));
        }

        System.out.println(n - Math.max(dp[n - 1][0], Math.max(dp[n - 1][1], dp[n - 1][2])));
    }
}
