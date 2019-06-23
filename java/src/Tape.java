import java.util.*;

public class Tape {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }

        int[] diffs = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            diffs[i] = b[i + 1] - b[i];
        }

        Arrays.sort(diffs);

        int len = 0;
        for (int i = 0; i < n - k; i++) {
            len += diffs[i];
        }

        System.out.println(len + k);
    }
}
