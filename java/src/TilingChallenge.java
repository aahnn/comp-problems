import java.util.*;

public class TilingChallenge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        board = new char[n][n];

        for (int i = 0; i < n; i++) {
            board[i] = in.next().toCharArray();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] != '#') {
                    if (!place(i, j)) {
                        System.out.println("NO");
                        return;
                    }
                }
            }
        }

        System.out.println("YES");
    }

    static char[][] board;
    private static boolean place(int i, int j) {
        board[i][j] = '#';
        if (i + 1 >= board.length || board[i + 1][j] == '#') {
            return false;
        }
        else {
            board[i + 1][j] = '#';
        }
        if (i + 2 >= board.length || board[i + 2][j] == '#') {
            return false;
        }
        else {
            board[i + 2][j] = '#';
        }
        if (j + 1 >= board.length || board[i + 1][j + 1] == '#') {
            return false;
        }
        else {
            board[i + 1][j + 1] = '#';
        }
        if (j - 1 < 0 || board[i + 1][j - 1] == '#') {
            return false;
        }
        else {
            board[i + 1][j - 1] = '#';
        }

        return true;
    }
}
