import java.util.*;

public class ArtUnion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();

        int[][] times = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                times[i][j] = in.nextInt();
            }
        }

        for (int i = 1; i < n; i++) {
            times[0][i] += times[0][i - 1];
        }
        for (int i = 1; i < m; i++) {
            times[i][0] += times[i - 1][0];
        }

        for (int j = 1; j < n; j++) {
            for (int i = 1; i < m; i++) {
                    times[i][j] += Math.max(times[i][j - 1], times[i - 1][j]);
            }
        }

        StringBuilder out = new StringBuilder();
        for (int i = 0; i < m; i++) {
            out.append(times[i][n - 1]);
            out.append(" ");
        }

        System.out.println(out);
    }
}
