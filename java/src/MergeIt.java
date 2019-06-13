import java.util.*;

public class MergeIt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int q = 0; q < t; q++) {
            int n = in.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
            }

            int numDiv = 0;
            boolean[] used = new boolean[n];
            for (int i = 0; i < n; i++) {
                if (used[i]) {
                    continue;
                }
                if (a[i] % 3 == 0) {
                    numDiv++;
                    used[i] = true;
                } else {
                    for (int j = 0; j < n; j++) {
                        if (j != i && !used[j] && (a[i] + a[j]) % 3 == 0) {
                            used[i] = true;
                            used[j] = true;
                            numDiv++;
                            break;
                        }
                    }
                }
            }

            int leftovers = 0;
            for (int i = 0; i < n; i++) {
                if (!used[i]) {
                    leftovers++;
                }
            }
            numDiv += leftovers / 3;


            System.out.println(numDiv);
        }
    }
}
