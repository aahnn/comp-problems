import java.util.*;

public class FlippingGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        int best = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                for (int k = j; k <= i; k++) {
                    nums[k] = 1 - nums[k];
                }
                best = Math.max(best, countOnes(nums));
                for (int k = j; k <= i; k++) {
                    nums[k] = 1 - nums[k];
                }
            }
        }
        System.out.println(best);
    }

    private static int countOnes(int[] nums) {
        int numOnes = 0;
        for (int i : nums) {
            if (i == 1) {
                numOnes++;
            }
        }
        return numOnes;
    }
}
