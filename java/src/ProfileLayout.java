import java.util.*;

public class ProfileLayout {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int P = in.nextInt();
        int C = in.nextInt();
        int[] posts = new int[P];
        int max = posts[0];
        int sum = 0;
        for (int i = 0; i < P; i++) {
            posts[i] = in.nextInt();
            max = Math.max(posts[i], max);
            sum += posts[i];
        }

        int lo = max;
        int hi = sum;

        // insight: we keep checking if a particular height fits all posts, lowering our
        // search range if so, until we hit the minimum.
        while (lo < hi) {
            int mid = (hi - lo) / 2 + lo;
            if (works(posts, mid, C)) {
                hi = mid;
            }
            else {
                // may run into infinite loop due to int truncation without +1
                lo = mid + 1;
            }
        }
        System.out.println(lo);

    }

    private static boolean works(int[] posts, int height, int numCols) {
        int currHeight = posts[0];
        int colsUsed = 1;
        for (int i = 1; i < posts.length; i++) {
            if (currHeight + posts[i] + 10 > height) {
                currHeight = posts[i];
                colsUsed++;
            }
            else {
                currHeight += posts[i] + 10;
            }
        }
        return colsUsed <= numCols;
    }
}
