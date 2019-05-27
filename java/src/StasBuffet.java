import java.util.*;

public class StasBuffet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] ab = new int[n][2];
        for (int i = 0; i < n; i++) {
            ab[i][0] = in.nextInt();
            ab[i][1] = in.nextInt();
        }

        long cDis = 0;
        for (int i = 0; i < n; i++) {
            cDis += (long)ab[i][1] * (n - 1);
        }

        Integer[] diffs = new Integer[n];
        for (int i = 0; i < n; i++) {
            diffs[i] = ab[i][0] - ab[i][1];
        }

        Arrays.sort(diffs, Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            cDis += (long)diffs[i] * i;
        }

        System.out.println(cDis);

    }
}
