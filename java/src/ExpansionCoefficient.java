import java.util.*;

public class ExpansionCoefficient {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int len = Math.max(i, n - i - 1);
            k = Math.min(k, a / len);
        }

        System.out.println(k);
    }
}
