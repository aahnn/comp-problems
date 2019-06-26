import java.util.*;

public class D3M2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Set<Long> a = new HashSet<>();
        for (int i  = 0; i < n; i++) {
            a.add(in.nextLong());
        }

        long first = -1;
        for (long i : a) {
            if (!(i % 2 == 0 && a.contains(i / 2)) && !a.contains(i * 3)) {
                first = i;
            }
        }

        long[] ans = new long[n];
        ans[0] = first;
        for (int i = 1; i < n; i++) {
            if (a.contains(ans[i - 1] * 2)) {
                ans[i] = ans[i - 1] * 2;
            } else {
                ans[i] = ans[i - 1] / 3;
            }
        }

        StringBuilder out = new StringBuilder();
        for (long i : ans) {
            out.append(i);
            out.append(" ");
        }

        System.out.println(out);
    }
}
