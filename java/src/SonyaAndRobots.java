import java.util.*;

public class SonyaAndRobots {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        Map<Integer, List<Integer>> indexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!indexMap.containsKey(a[i])) {
                indexMap.put(a[i], new ArrayList<>());
            }
            indexMap.get(a[i]).add(i);
        }


        int numPairs = n * (n - 1) / 2;
        for (List<Integer> l: indexMap.values()) {
            for (int i = 1; i < l.size(); i++) {
                numPairs -= n - 1 - l.get(i);
            }

            for (int i = l.size() - 2; i >= 0; i--) {
                numPairs -= l.get(i);
            }
        }

        System.out.println(numPairs);
    }
}
