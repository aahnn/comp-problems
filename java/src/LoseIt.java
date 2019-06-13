import java.util.*;

public class LoseIt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[]{4, 8, 15, 16, 23, 42};
        int[] indices = new int[n];
        for (int i = 0; i < n; i++) {
            int curr = in.nextInt();
            indices[i] = Arrays.binarySearch(a, curr);
        }

        int[] count = new int[6];
        for (int i = 0; i < n; i++) {
            int currIdx = indices[i];
            if (currIdx == 0) {
                count[0]++;
            } else if (count[currIdx - 1] > 0){
                count[currIdx - 1]--;
                count[currIdx]++;
            }
        }

        System.out.println(n - 6 * count[5]);
    }
}
