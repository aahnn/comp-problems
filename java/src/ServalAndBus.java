import java.util.*;

public class ServalAndBus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int bestRoute = 1;
        int bestTime = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            int currTime = in.nextInt();
            int interval = in.nextInt();
            while (currTime < t) {
                currTime += interval;
            }
            if (currTime < bestTime) {
                bestTime = currTime;
                bestRoute = i;
            }
        }

        System.out.println(bestRoute);
    }
}
