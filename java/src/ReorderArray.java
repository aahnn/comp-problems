import java.util.*;

public class ReorderArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Integer, Integer> freqs = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int curr = in.nextInt();
            freqs.put(curr, freqs.getOrDefault(curr, 0) + 1);
        }

        System.out.println(n - Collections.max(freqs.values()));
    }
}
