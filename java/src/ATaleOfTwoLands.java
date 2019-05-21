import java.util.*;

public class ATaleOfTwoLands {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Math.abs(in.nextInt());
        }

        Arrays.sort(a);

        long numPairs = 0;
        int rightIdx = 1;
        for (int i = 0; i < n - 1; i++) {
            while (rightIdx < a.length && a[rightIdx] <= 2 * a[i]) {
                rightIdx++;
            }
            numPairs += rightIdx - i - 1;
        }
        System.out.println(numPairs);

    }
}
