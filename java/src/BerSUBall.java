import java.util.*;

public class BerSUBall {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        Arrays.sort(a);

        int m = in.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = in.nextInt();
        }
        Arrays.sort(b);

        int j = 0;
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            if (b[j] - a[i] > 1) {
                continue;
            }
            while (j < m && b[j] - a[i] < -1) {
                j++;
            }
            if (j != m && b[j] - a[i] < 2) {
                pairs++;
                j++;
            }
            if (j >= m) {
                break;
            }
        }

        System.out.println(pairs);

    }
}
