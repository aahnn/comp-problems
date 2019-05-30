import java.util.*;

public class ServalAndToyBricks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int h = in.nextInt();
        int[] a = new int[m];
        int[] b = new int[n];
        for (int i = 0; i < m; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }

        int[][] c = new int[n][m];
        for (int i = 0; i < n; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < m; j++) {
                int one = in.nextInt();
                if (one == 1) {
                    line.append(Math.min(b[i], a[j]));
                } else {
                    line.append(0);
                }
                line.append(" ");
            }
            System.out.println(line);
        }
    }
}
