import java.util.*;

public class ArrayKColoring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        if (k > n) {
            System.out.println("NO");
            return;
        }
        int[] freqs = new int[5001];
        StringBuilder ans = new StringBuilder();

        int highestColor = 1;
        for (int i = 0; i < n; i++) {
            int curr = in.nextInt();
            freqs[curr]++;
            if (freqs[curr] > k) {
                System.out.println("NO");
                return;
            }

            highestColor = Math.max(highestColor, freqs[curr]);
            if (highestColor < k && i >= n - (k - highestColor)) {
                highestColor++;
                ans.append(highestColor);
            } else {
                ans.append(freqs[curr]);

            }
            ans.append(" ");
        }

        System.out.println("YES");
        System.out.println(ans);
    }
}
