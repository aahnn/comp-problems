import java.util.*;

public class SerejaSuffixes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int[] ans = new int[n];
        Set<Integer> distincts = new HashSet<>();
        for (int i = n - 1; i >= 0; i--) {
            distincts.add(a[i]);
            ans[i] = distincts.size();
        }

        for (int i = 0; i < m; i++) {
            int currIndex = in.nextInt() - 1;
            System.out.println(ans[currIndex]);
        }

    }
}
