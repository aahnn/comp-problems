import java.util.*;

public class Weather {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        int nonNeg = 0;
        int nonPos = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0) {
                nonPos++;
            }
        }

        int best = nonPos;

        for (int k = 0; k < n; k++) {
            if (nums[k] >= 0) {
                nonNeg++;
            }
            if (nums[k] <= 0) {
                nonPos--;
            }
            best = Math.min(best, nonPos + nonNeg);
        }

        System.out.println(best);
    }
}
