import java.util.*;

public class HiddenWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int w = in.nextInt();
        char[][] grid = new char[h][w];
        for (int i = 0; i < h; i++) {
            grid[i] = in.next().toCharArray();
        }

        Map<String, Boolean> words = new HashMap<>();
        int numWords = 0;
        int n = in.nextInt();
        for (int a = 0; a < n; a++) {
            String word = in.next();
            if (words.containsKey(word)) {
                if (words.get(word)) {
                    numWords++;
                }
            }
            else if (search(grid, word)) {
                numWords++;
                words.put(word, true);
            }
            else {
                words.put(word, false);
            }
        }

        System.out.println(numWords);
    }

    private static boolean search(char[][] grid, String word) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (dfs(grid, i, j, word, 0, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean dfs(char[][] grid, int row, int col, String word, int i, boolean[][] visited) {
        if (i >= word.length()) {
            return true;
        }
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length) {
            return false;
        }
        if (!visited[row][col] && grid[row][col] == word.charAt(i)) {
            visited[row][col] = true;
            i++;
            if (dfs(grid, row + 1, col, word, i, visited)
                    || dfs(grid, row - 1, col, word, i, visited)
                    || dfs(grid, row, col + 1, word, i, visited)
                    || dfs(grid, row, col - 1, word, i, visited)) {
                return true;
            }
            visited[row][col] = false;

        }
        return false;
    }
}
