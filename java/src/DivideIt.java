import java.util.*;

public class DivideIt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        Map<Long, Integer> memo = new HashMap<>();
        for (int i = 0; i < q; i++) {
            int numOps = ops(in.nextLong(), memo);
            System.out.println(numOps >= 0 ? numOps : -1);
        }
    }

    private static int ops(long n, Map<Long, Integer> memo) {
        if (n == 1) {
            return 0;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int moves = -1;
        if (n % 2 == 0) {
            moves = 1 + ops(n / 2, memo);
        } else if (n % 3 == 0) {
            moves = 1 + ops(2 * n / 3, memo);
        } else if (n % 5 == 0) {
            moves = 1 + ops(4 * n / 5, memo);
        }
        if (moves < 0) {
            return Integer.MIN_VALUE;
        }
        memo.put(n, moves);
        return moves;
    }
}
