import java.util.*;

public class Game23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int q = m / n;
        if (q * n != m) {
            System.out.println(-1);
            System.exit(0);
        }

        int ans = 0;
        while (q > 1) {
            if (q % 2 == 0) {
                ans++;
                q = q / 2;
            }
            else if (q % 3 == 0) {
                ans++;
                q = q / 3;
            }
            else {
                System.out.println(-1);
                System.exit(0);
            }
        }

        System.out.println(ans);
    }
}
