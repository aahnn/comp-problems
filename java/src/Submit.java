import java.util.*;

public class Submit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double X = in.nextDouble();

        double hi = X;
        double lo = 0;
        double error = 1e-9;
        while (hi - lo > error) {
            double mid = (hi - lo) / 2 + lo;
            if (mid * (Math.log(mid) / Math.log(2)) > X) {
                hi = mid;
            }
            else {
                lo = mid;
            }
        }

        System.out.println(hi);
    }
}
