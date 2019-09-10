import java.util.*;

public class Uniqueness {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        Set<Integer> uniques = new HashSet<>();
        Map<Integer, Integer> duplicates = new HashMap<>();

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            if (uniques.contains(a[i])) {
                duplicates.put(a[i], duplicates.getOrDefault(a[i], 0) + 1);
            } else {
                uniques.add(a[i]);
            }
        }
        if (uniques.size() == n) {
            System.out.println(0);
            System.exit(0);
        }

        int best = n;
        for (int i = 0; i < n; i++) {
            if (duplicates.containsKey(a[i])) {
                Map<Integer, Integer> copy = new HashMap<>(duplicates);
                for (int j = i; j < n; j++) {
                    if (copy.containsKey(a[j])) {
                        copy.put(a[j], copy.get(a[j]) - 1);
                        if (copy.get(a[j]) == 0) {
                            copy.remove(a[j]);
                        }
                    }

                    if (copy.size() == 0) {
                        best = Math.min(best, j - i + 1);
                    }
                }
            }
        }

        System.out.println(best);
    }
}
