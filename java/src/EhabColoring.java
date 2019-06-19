import java.util.*;

public class EhabColoring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n - 1];
        int curr = 1;
        for (int i = 2; i <= n; i++) {
            int d = firstDivisor(i);
            if (d == -1) {
                a[i - 2] = curr;
                curr++;
            } else {
                a[i - 2] = a[d - 2];
            }
        }

        StringBuilder ans = new StringBuilder();
        for (int i : a) {
            ans.append(i);
            ans.append(" ");
        }

        System.out.println(ans);
    }

    private static int firstDivisor(int x) {
        if (x <= 3) {
            return -1;
        }

        if (x % 2 == 0) {
            return 2;
        }

        for (int i = 3; i * i <= x; i += 2) {
            if (x % i == 0) {
                return i;
            }
        }

        return -1;
    }
}
