import java.util.*;

public class NumberCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        Arrays.sort(a);
        if (a[n - 1] >= a[n - 2] + a[n - 3]) {
            System.out.println("NO");
        } else {
            int prev = a[0];
            a[0] = a[n - 3];
            for (int i = 1; i <= n - 3; i++) {
                int curr = a[i];
                a[i] = prev;
                prev = curr;
            }
            System.out.println("YES");
            StringBuilder out = new StringBuilder();
            for (int num : a) {
                out.append(num);
                out.append(" ");
            }
            System.out.println(out);
        }
    }
}
