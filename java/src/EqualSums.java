import java.util.*;

public class EqualSums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        Map<Integer, int[]> sums = new HashMap<>();
        for (int i = 0; i < k; i++) {
            int n = in.nextInt();
            int[] sequence = new int[n];
            int sum = 0;
            for (int j = 0; j < n; j++) {
                int t = in.nextInt();
                sum += t;
                sequence[j] = t;
            }
            Map<Integer, int[]> tempMap = new HashMap<>();
            for (int j = 0; j < n; j++) {
                int curr = sum - sequence[j];
                if (sums.containsKey(curr)) {
                    System.out.println("YES");
                    System.out.println((1 + sums.get(curr)[0]) + " " + (1 + sums.get(curr)[1]));
                    System.out.println((1 + i) + " " + (1 + j));
                    return;
                }
                tempMap.put(curr, new int[]{i, j});
            }

            sums.putAll(tempMap);
        }

        System.out.println("NO");
    }
}
