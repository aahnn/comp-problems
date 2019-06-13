import java.util.*;

public class EhabThanos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        int firstHalf = 0;
        int secondHalf = 0;
        for (int i = 0; i < n; i++) {
            firstHalf += a[i];
        }
        for (int i = n; i < 2 * n; i++) {
            secondHalf += a[i];
        }

        if (firstHalf == secondHalf) {
            System.out.println(-1);
        } else {
            StringBuilder out = new StringBuilder();
            for (int i : a) {
                out.append(i);
                out.append(" ");
            }

            System.out.println(out);
        }

    }
}
