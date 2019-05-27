import java.util.*;

public class MaximAndBiology {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();

        int best = Integer.MAX_VALUE;
        String g = "ACTG";
        for (int i = 0; i <= n - g.length(); i++) {
            int numOps = 0;
            for (int j = 0; j < g.length(); j++) {
                char curr = s.charAt(i + j);
                char correct = g.charAt(j);
                numOps += Math.min(Math.abs(curr - correct), 26 - Math.abs(curr - correct));
            }
            best = Math.min(best, numOps);

        }

        System.out.println(best);
    }
}
