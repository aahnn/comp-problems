import java.util.*;

public class Spotlights {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[][] actors = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                actors[i][j] = in.nextInt();
            }
        }

        int numGood = 0;

        boolean[][] goods = new boolean[n][m];
        // left to right
        for (int i = 0; i < n; i++) {
            if (actors[i][0] == 1) {
                goods[i][0] = true;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (actors[i][j] == 0 && goods[i][j - 1]) {
                    numGood++;
                }
                if (actors[i][j] == 1 || goods[i][j - 1]) {
                    goods[i][j] = true;
                }
            }
        }
        // right to left
        goods = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            if (actors[i][m - 1] == 1) {
                goods[i][m - 1] = true;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = m - 2; j >= 0; j--) {
                if (actors[i][j] == 0 && goods[i][j + 1]) {
                    numGood++;
                }
                if (actors[i][j] == 1 || goods[i][j + 1]) {
                    goods[i][j] = true;
                }
            }
        }

        // top to bottom
        goods = new boolean[n][m];
        for (int i = 0; i < m; i++) {
            if (actors[0][i] == 1) {
                goods[0][i] = true;
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (actors[i][j] == 0 && goods[i - 1][j]) {
                    numGood++;
                }
                if (actors[i][j] == 1 || goods[i - 1][j]) {
                    goods[i][j] = true;
                }
            }
        }

        // bottom to top
        goods = new boolean[n][m];
        for (int i = 0; i < m; i++) {
            if (actors[n - 1][i] == 1) {
                goods[n - 1][i] = true;
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < m; j++) {
                if (actors[i][j] == 0 && goods[i + 1][j]) {
                    numGood++;
                }
                if (actors[i][j] == 1 || goods[i + 1][j]) {
                    goods[i][j] = true;
                }
            }
        }

        System.out.println(numGood);
    }

}
