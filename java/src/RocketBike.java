import java.util.*;

public class RocketBike {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int B = in.nextInt();
        int D = in.nextInt();

        double error = 1e-9;
        double time = Math.sqrt((2 * B) / 9.81);
        double target = D / time;
        double hi = target;
        double lo = 0;
        while (hi - lo > error) {
            double mid = (hi - lo) / 2 + lo;
            if (Math.pow(mid, 5) * 2 + Math.pow(mid, 4) * 3 + mid < target) {
                lo = mid;
            }
            else {
                hi = mid;
            }
        }
        System.out.println(hi);
    }
}
