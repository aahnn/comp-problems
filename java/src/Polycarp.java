import java.util.*;

public class Polycarp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] q = new int[n];
        for (int i = 0; i < n - 1; i++) {
            q[i] = in.nextInt();
        }

        int[] sums = new int[n];
        sums[0] = 0;
        int min = 0;
        for (int i = 1; i < n; i++) {
            sums[i] = sums[i - 1] + q[i - 1];
            min = Math.min(min, sums[i]);
        }

        int x = 1 - min;
        Set<Integer> distincts = new HashSet<>();
        boolean perm = true;
        for (int i = 0; i < n; i++) {
            sums[i] += x;
            distincts.add(sums[i]);
            if (sums[i] < 1 || sums[i] > n) {
                perm = false;
            }
        }

        if (perm && distincts.size() == n) {
            StringBuilder p = new StringBuilder();
            for (int i = 0; i < n; i++) {
                p.append(sums[i]);
                p.append(" ");
            }
            System.out.println(p.toString());
        }
        else {
            System.out.println(-1);
        }
    }
}
