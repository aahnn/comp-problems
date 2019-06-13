import java.util.*;

public class TwoCakes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] locations = new int[n + 1][2];
        for (int i = 1; i <= 2 * n; i++) {
            int house = in.nextInt();
            if (locations[house][0] == 0) {
                locations[house][0] = i;
            } else {
                locations[house][1] = i;
            }
        }
        locations[0][0] = 1;
        locations[0][1] = 1;
        long dist = 0;
        for (int i = 1; i <= n; i++) {
            dist += Math.min(
                    Math.abs(locations[i][0] - locations[i - 1][0]) + Math.abs(locations[i][1] - locations[i - 1][1]),
                    Math.abs(locations[i][1] - locations[i - 1][0]) + Math.abs(locations[i][0] - locations[i - 1][1]));
        }

        System.out.println(dist);
    }
}
