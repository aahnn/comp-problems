import java.util.*;

public class EatingSoup {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        if (m == 0) {
            System.out.println(1);
            return;
        }


        // in general: m
        // once you hit n/2 strikes you start going back down.
        int groups = m;
        int maxGroups = n / 2;
        if (m > maxGroups) {
            groups = maxGroups - (m - maxGroups);
            if (n % 2 == 1) {
                groups++;
            }
        }
        System.out.println(groups);
    }
}
