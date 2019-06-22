import java.util.*;

public class Equator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];

        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            sum += a[i];
        }

        int target = (sum + 1) / 2;
        int currSum = 0;
        for (int i = 0; i < n; i++) {
            currSum += a[i];
            if (currSum >= target) {
                System.out.println(i + 1);
                return;
            }
        }


    }
}
