import java.util.*;

public class ThreePartsArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        long[] leftSums = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            leftSums[i] += leftSums[i - 1] + a[i - 1];
        }

        Map<Long, Integer> sumToIndex = new HashMap<>();
        long rightSum = 0;
        for (int i = n - 1; i >= 0; i--) {
            rightSum += a[i];
            sumToIndex.put(rightSum, i);
        }

        long best = 0;
        for (int i = 1; i <= n; i++) {
            if (sumToIndex.containsKey(leftSums[i]) && sumToIndex.get(leftSums[i]) > i - 1) {
                best = Math.max(best, leftSums[i]);
            }
        }

        System.out.println(best);

    }
}
