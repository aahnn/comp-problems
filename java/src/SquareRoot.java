import java.util.*;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double X = in.nextDouble();

        double lo = 0;
        double hi = X;
        double error = 1e-6;
        while (Math.abs(hi * hi - X) >= error) {
            double mid = (hi - lo) / 2 + lo;
            if (mid * mid < X) {
                lo = mid;
            }
            else {
                hi = mid;
            }
        }
        System.out.println(hi);
    }
}
