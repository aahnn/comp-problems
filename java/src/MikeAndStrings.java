import java.util.*;

public class MikeAndStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = in.next();
        }
        int k = strings[0].length();
        int[][] dp = new int[n][k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                dp[i][j] = Integer.MAX_VALUE - k;
            }
        }

        for (int i = 0; i < n; i++) {
            strings[i] = strings[i] + strings[i];
        }

        for (int i = 0; i < k; i++) {
            dp[0][i] = i;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < k; j++) {
                for (int prev = 0; prev < k; prev++) {
                    if (strings[i].substring(j, j + k).equals(strings[i - 1].substring(prev, prev + k))) {
                        dp[i][j] = Math.min(dp[i][j], dp[i - 1][prev] + j);
                    }
                }
            }
        }

        int ans = Integer.MAX_VALUE - k;
        for (int i = 0; i < k; i++) {
            ans = Math.min(ans, dp[n - 1][i]);
        }

        if (ans == Integer.MAX_VALUE - k) {
            System.out.println(-1);
        }
        else {
            System.out.println(ans);
        }
    }
}
