import java.util.*;

public class AlmostAllDivisors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int[] d = new int[n];
            for (int a = 0; a < n; a++) {
                d[a] = in.nextInt();
            }
            Arrays.sort(d);
            long x = (long)d[0] * d[n - 1];
            List<Integer> divs = new ArrayList<>();
            for (long a = 2; a * a <= x; a++) {
                if (x % a == 0) {
                    divs.add((int)a);
                    if (x / a != a) {
                        divs.add((int)(x / a));
                    }
                }
            }
            Collections.sort(divs);

            boolean valid = false;
            if (divs.size() == n) {
                boolean equal = true;
                for (int a = 0; a < n; a++) {
                    if (divs.get(a) != d[a]) {
                        equal = false;
                    }
                }
                valid = equal;
            }
            System.out.println(valid ? x : -1);
        }
    }
}
