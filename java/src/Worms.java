import java.util.*;

public class Worms {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] wormToPile = new int[1000001];
        int currWorm = 1;
        int currPile = 1;
        for (int i = 0; i < n; i++) {
            int worms = in.nextInt();
            for (int w = 0; w < worms; w++) {
                wormToPile[currWorm] = currPile;
                currWorm++;
            }
            currPile++;
        }

        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            System.out.println(wormToPile[in.nextInt()]);
        }
    }
}
