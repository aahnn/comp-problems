import java.util.*;

public class KefaFirstSteps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int best = 1;
        int count = 1;
        int prev = in.nextInt();
        for (int i = 1; i < n; i++) {
            int curr = in.nextInt();
            if (curr >= prev) {
                count++;
            }
            else {
                best = Math.max(best, count);
                count = 1;
            }
            prev = curr;
        }
        best = Math.max(best, count);
        System.out.println(best);
    }
}
