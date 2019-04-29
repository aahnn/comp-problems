import java.util.*;

public class IlyaAndQueries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int m = in.nextInt();
        int[] sums = new int[s.length()];
        for (int i = 1; i < sums.length; i++) {
            sums[i] = sums[i - 1];
            if (s.charAt(i - 1) == s.charAt(i)) {
                sums[i]++;
            }
        }
        for (int i = 0; i < m; i++) {
            int l = in.nextInt() - 1;
            int r = in.nextInt() - 1;
            System.out.println(sums[r] - sums[l]);
        }
    }
}
