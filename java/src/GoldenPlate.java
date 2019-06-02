import java.util.*;

public class GoldenPlate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int w = in.nextInt();
        int h = in.nextInt();
        int k = in.nextInt();
        int numGilds = 0;
        for (int i = 0; i < k; i++) {
            numGilds += 2 * w + 2 * (h - 2);
            w -= 4;
            h -= 4;
        }

        System.out.println(numGilds);
    }
}
