import java.util.*;

public class ZeroArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long sum = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int curr = in.nextInt();
            sum += curr;
            max = Math.max(max, curr);
        }
        System.out.println(sum % 2 == 1 || 2 * max > sum? "NO" : "YES");
    }
}
