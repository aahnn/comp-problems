import java.util.*;

public class SummarizePowerTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        List<Integer> powersOfTwo = new ArrayList<>();
        int currp = 1;
        for (int i = 0; i < 30; i++) {
            currp *= 2;
            powersOfTwo.add(currp);
        }

        int[] arr = new int[n];
        Map<Integer, Integer> freqs = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int curr = in.nextInt();
            arr[i] = curr;
            int currFreq = freqs.getOrDefault(curr, 0);
            freqs.put(curr, currFreq + 1);
        }

        int change = 0;
        for (int i : arr) {
            boolean works = false;
            for (int p : powersOfTwo) {
                if (freqs.containsKey(p - i) && !(p - i == i && freqs.get(i) <= 1)) {
                    works = true;
                }
            }
            if (!works) {
                change++;
            }
        }

        System.out.println(change);
    }
}
