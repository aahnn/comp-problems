import java.util.*;

public class MaxMedian {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        Map<Integer, Integer> freqs = new HashMap<>();
        List<Integer> increments = new ArrayList<>();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        Arrays.sort(nums);
        int i = (n - 1) / 2;
        int median = nums[i];
        while (i < n - 1) {
            i++;
            int increment = nums[i] - median;
            if (freqs.containsKey(increment)) {
                freqs.put(increment, freqs.get(increment) + 1);
            } else {
                freqs.put(increment, 1);
                increments.add(increment);
            }
        }

        int currIncrement = 0;
        int next = 0;
        int prev = 1;
        while (k > 0) {
            if (freqs.containsKey(currIncrement)) {
                prev += freqs.get(currIncrement);

                k -= prev;
                next++;
                if (k >= 0) {
                    median++;
                }
                currIncrement++;

            } else {
                if (next < increments.size() && (increments.get(next) - currIncrement) * (long)prev <= (long)k) {
                    k -= (increments.get(next) - currIncrement) * prev;
                    median += increments.get(next) - currIncrement;
                    currIncrement = increments.get(next);
                } else {
                    median += k / prev;
                    break;
                }
            }

        }

        System.out.println(median);
    }
}
