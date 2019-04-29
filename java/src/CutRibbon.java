import java.util.*;

public class CutRibbon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        Map<Integer, Integer> memo = new HashMap<>();
        memo.put(0, 0);
        System.out.println(best(n, a, b, c, memo));
    }

    private static int best(int n, int a, int b, int c, Map<Integer, Integer> memo) {
        if (n < 0) {
            return Integer.MIN_VALUE;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }


        int best = 1 + Math.max(best(n - a, a, b, c, memo),
                Math.max(best(n - b, a, b, c, memo), best(n - c, a, b, c, memo)));
        memo.put(n, best);
        return best;
    }
}
