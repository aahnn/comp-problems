import java.util.*;

public class JollyJumpers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int n = input.nextInt();
            boolean[] visited = new boolean[n];

            int prev = input.nextInt();
            for (int i = 0; i < n - 1; i++) {
                int curr = input.nextInt();
                int diff = Math.abs(curr - prev);
                if (diff < n) {
                    visited[diff] = true;
                }
                prev = curr;
            }

            boolean isJolly = true;
            for (int i = 1; i < n; i++) {
                if (visited[i] == false) {
                    isJolly = false;
                }
            }
            System.out.println(isJolly ? "Jolly" : "Not jolly");
        }
    }
}
