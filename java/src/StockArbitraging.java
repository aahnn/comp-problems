import java.util.*;

public class StockArbitraging {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int r = in.nextInt();
        List<Integer> s = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            s.add(in.nextInt());
        }
        for (int i = 0; i < m; i++) {
            b.add(in.nextInt());
        }

        int cheapest = Collections.min(s);
        int expensivest = Collections.max(b);
        if (cheapest < expensivest) {
            int shares = r / cheapest;
            r %= cheapest;
            r += shares * expensivest;
        }

        System.out.println(r);

    }
}
