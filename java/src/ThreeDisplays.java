import java.util.*;

public class ThreeDisplays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] sizes = new int[n];
        for (int i = 0; i < n; i++) {
            sizes[i] = in.nextInt();
        }
        int[] costs = new int[n];
        for (int i = 0; i < n; i++) {
            costs[i] = in.nextInt();
        }

        int best = Integer.MAX_VALUE;
        int[][] dp = new int[n][3];
        for (int i = n - 1; i >= 0; i--) {
            dp[i][1] = costs[i];
            int best2 = Integer.MAX_VALUE;
            for (int j = i + 1; j < n; j++) {
                if (sizes[i] < sizes[j]) {
                    if (dp[j][2] > 0) {
                        best = Math.min(best, dp[j][2] + costs[i]);
                    }
                    best2 = Math.min(best2, dp[j][1] + costs[i]);
                }
            }
            if (best2 != Integer.MAX_VALUE) {
                dp[i][2] = best2;
            }
        }

        System.out.println(best == Integer.MAX_VALUE ? -1 : best);
    }
}
