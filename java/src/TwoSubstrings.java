import java.util.*;

public class TwoSubstrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        int abFirst = s.indexOf("AB");
        int baLast = s.lastIndexOf("BA");
        if (abFirst != -1 && baLast != -1) {
            if (Math.abs(abFirst - baLast) > 1) {
                System.out.println("YES");
                return;
            }

            int abLast = s.lastIndexOf("AB");
            int baFirst = s.indexOf("BA");
            if (Math.abs(abLast - baFirst) > 1) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
