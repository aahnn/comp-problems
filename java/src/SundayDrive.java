import java.util.*;

public class SundayDrive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        lanes = in.nextInt();
        dirs = new String[n];
        lengths = new int[n];
        for (int i = 0; i < n; i++) {
            dirs[i] = in.next();
            lengths[i] = in.nextInt();
        }

        double minDist = Double.MAX_VALUE;
        for (int i = 0; i < lanes; i++) {
            minDist = Math.min(minDist, dist(0, i, new double[n][lanes]));
        }
        System.out.println(minDist);


    }
    static int n;
    static int lanes;
    static String[] dirs;
    static int[] lengths;

    private static double dist(int road, int lane, double[][] memo) {
        if (road >= n) {
            return 0;
        }

        if (memo[road][lane] > 0) {
            return memo[road][lane];
        }

        double minDist = Double.MAX_VALUE;
        if (dirs[road].equals("S")) {
            int laneShift = lengths[road] / 100;
            for (int i = Math.max(0, lane - laneShift); i < Math.min(lanes, lane + laneShift + 1); i++) {
                int laneDist = Math.abs(i - lane) * 10;
                double currDist = Math.sqrt(lengths[road] * lengths[road] + laneDist * laneDist);
                minDist = Math.min(minDist, currDist + dist(road + 1, i, memo));
            }
        } else if (dirs[road].equals("L")) {
            int radius = lengths[road] + lane * 10 + 5;
            minDist = Math.PI / 2 * radius + dist(road + 1, lane, memo);
        } else if (dirs[road].equals("R")) {
            int radius = lengths[road] + ((lanes - 1 - lane) * 10) + 5;
            minDist = Math.PI / 2 * radius + dist(road + 1, lane, memo);
        }

        memo[road][lane] = minDist;
        return minDist;
    }
}
