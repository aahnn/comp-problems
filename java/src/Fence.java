import java.util.*;

public class Fence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] planks = new int[n];
        for (int i = 0; i < n; i++) {
            planks[i] = in.nextInt();
        }

        int[] sums = new int[n + 1];
        sums[0] = 0;
        for (int i = 0; i < n; i++) {
            sums[i + 1] = sums[i] + planks[i];
        }

        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        for (int i = 0; i + k <= n; i++) {
            if (sums[i + k] - sums[i] < min) {
                min = sums[i + k] - sums[i];
                minIndex = i;
            }
        }

        System.out.println(minIndex + 1);
    }
}
