import java.util.*;

public class AllTheVowelsPlease {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int rows = -1;
        int cols = -1;

        for (int n = 5; n * n <= k; n++) {
            for (int m = k / 5; m * m >= k; m--) {
                if (n * m == k) {
                    rows = n;
                    cols = m;
                }
            }
        }

        if (rows == -1 && cols == -1) {
            System.out.println(-1);
        }
        else {
            String s;
            char[][] grid = new char[rows][cols];
            int end = Math.min(rows, cols);
            StringBuilder sb = new StringBuilder("aeiou");
            while (sb.length() < end) {
                sb.append("d");
            }
            s = sb.toString();
            for (int i = 0; i < end; i++) {
                String ins = s.substring(i) + s.substring(0, i);
                for (int j = 0; j < s.length(); j++) {
                    grid[i][j] = ins.charAt(j);
                }
            }

            for (int i = end; i < rows; i++) {
                for (int j = 0; j < s.length(); j++) {
                    grid[i][j] = s.charAt(j);
                }
            }
            for (int i = end; i < cols; i++) {
                for (int j = 0; j < s.length(); j++) {
                    grid[j][i] = s.charAt(j);
                }
            }

            StringBuilder out = new StringBuilder();
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    out.append(grid[i][j]);
                }
            }
            System.out.println(out);
        }
    }
}
