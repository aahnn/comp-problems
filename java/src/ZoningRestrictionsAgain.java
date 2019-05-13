import java.util.*;

public class ZoningRestrictionsAgain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int h = in.nextInt();
        int m = in.nextInt();

        int[] heights = new int[n];
        Arrays.fill(heights, h);
        for (int restriction = 0; restriction < m; restriction++) {
            int l = in.nextInt() - 1;
            int r = in.nextInt() - 1;
            int x = in.nextInt();
            for (int i = l; i <= r; i++) {
                heights[i] = Math.min(heights[i], x);
            }
        }

        int price = 0;
        for (int i : heights) {
            price += i * i;
        }

        System.out.println(price);
    }
}
