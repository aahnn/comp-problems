import java.util.*;

public class Chocolates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] chocolates = new int[n];
        for (int i = 0; i < n; i++) {
            chocolates[i] = in.nextInt();
        }

        int[] bought = new int[n];
        bought[n - 1] = chocolates[n - 1];
        long sum = bought[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (bought[i + 1] == 1) {
                break;
            }
            bought[i] = Math.min(chocolates[i], bought[i + 1] - 1);
            sum += bought[i];
        }

        System.out.println(sum);
    }
}
