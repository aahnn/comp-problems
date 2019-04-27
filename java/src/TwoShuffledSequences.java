import java.util.*;

public class TwoShuffledSequences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer[] nums = new Integer[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        boolean[] used = new boolean[n];
        List<Integer> increasing = new ArrayList<>();
        List<Integer> decreasing = new ArrayList<>();

        Arrays.sort(nums);
        int prev = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] > prev ){
                used[i] = true;
                increasing.add(nums[i]);
                prev = nums[i];
            }
        }

        prev = Integer.MAX_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (!used[i]) {
                if (nums[i] >= prev) {
                    System.out.println("NO");
                    return;
                }
                decreasing.add(nums[i]);
                prev = nums[i];
            }
        }

        System.out.println("YES");

        StringBuilder out1 = new StringBuilder();
        for (int i : increasing) {
            out1.append(i);
            out1.append(" ");
        }
        StringBuilder out2 = new StringBuilder();
        for (int i : decreasing) {
            out2.append(i);
            out2.append(" ");
        }

        System.out.println(increasing.size());
        System.out.println(out1);
        System.out.println(decreasing.size());
        System.out.println(out2);
    }
}
