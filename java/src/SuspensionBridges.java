import java.util.*;

public class SuspensionBridges {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d = in.nextInt();
        int s = in.nextInt();
        double lo = 0;
        double hi = d * d;
        double error = 1e-10;
        while (hi - lo > error) {
            double mid = (hi - lo) / 2 + lo;
            if (mid * Math.cosh(d / (2 * mid)) - mid < s) {
                hi = mid;
            }
            else {
                lo = mid;
            }
        }
        System.out.println(2 * hi * Math.sinh(d / (2 * hi)));

    }
}
