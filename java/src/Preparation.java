import java.util.*;

public class Preparation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();

        int[] remainCount = new int[k];
        for (int i = 0; i < n; i++) {
            int d = input.nextInt();
            remainCount[d % k]++;
        }
        int numBoxes = remainCount[0] / 2;
        if (k % 2 == 0) {
            numBoxes += remainCount[k / 2] / 2;
        }
        for (int i = 1; i < (k + 1) / 2; i++) {
            int j = k - i;
            numBoxes += Math.min(remainCount[i], remainCount[j]);
        }

        System.out.println(numBoxes * 2);
    }
}
