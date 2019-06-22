import java.util.*;

public class TwoButtons {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int ops = 0;
        while (m > n) {
            if (m % 2 == 0) {
                m /= 2;
            } else {
                m++;
            }
            ops++;
        }

        System.out.println(ops + n - m);
    }
}
