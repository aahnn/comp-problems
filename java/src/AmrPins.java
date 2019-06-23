import java.util.*;

public class AmrPins {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d = 2 * in.nextInt();
        long x = in.nextLong();
        long y = in.nextLong();
        long xP = in.nextLong();
        long yP = in.nextLong();

        double dist = Math.sqrt((xP -x) * (xP - x) + (yP - y) * (yP - y));
        System.out.println((int)Math.ceil(dist / d));
    }
}
