import java.util.*;

public class Remainder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        String num = in.next();
        int flips = 0;

        int len = num.length();
        for (int i = len - 1; i >= len - x; i--) {
            if (i == len - 1 - y) {
                if (num.charAt(i) == '0') {
                    flips++;
                }
            }
            else if (num.charAt(i) == '1') {
                flips++;
            }
        }

        System.out.println(flips);
    }
}
