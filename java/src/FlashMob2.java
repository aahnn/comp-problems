import java.util.*;

public class FlashMob2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = in.nextInt();
            y[i] = in.nextInt();
        }
        Arrays.sort(x);
        Arrays.sort(y);

        long bestDist = Long.MAX_VALUE;
        int[] bestPair = new int[]{0, 0};
        if (n % 2 == 0) {
            int x1 = x[n / 2 - 1];
            int x2 = x[n / 2];
            int y1 = y[n / 2 - 1];
            int y2 = y[n / 2];
            if (dist(x, y, x1, y1) < bestDist) {
                bestPair = new int[]{x1, y1};
                bestDist = dist(x, y, x1, y1);
            } if (dist(x, y, x1, y2) < bestDist) {
                bestPair = new int[]{x1, y2};
                bestDist = dist(x, y, x1, y2);
            } if (dist(x, y, x2, y1) < bestDist) {
                bestPair = new int[]{x2, y1};
                bestDist = dist(x, y, x2, y1);
            } if (dist(x, y, x2, y2) < bestDist) {
                bestPair = new int[]{x2, y2};
                bestDist = dist(x, y, x2, y2);
            }
        } else {
            bestDist = dist(x, y, x[n / 2], y[n / 2]);
            bestPair = new int[]{x[n / 2], y[n / 2]};
        }

        StringBuilder out = new StringBuilder();
        out.append('(');
        out.append(bestPair[0]);
        out.append(',');
        out.append(bestPair[1]);
        out.append(") ");
        out.append(bestDist);
        System.out.println(out);

    }

    private static long dist(int[] x, int[] y, int x1, int y1) {
        long dist = 0;
        for (int i = 0; i < x.length; i++) {
            dist += Math.abs(x1 - x[i]) + Math.abs(y1 - y[i]);
        }
        return dist;
    }
}
