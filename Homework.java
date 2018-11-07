import java.util.*;

public class Homework {
    private static int[][] memo = new int[10000][5000];
    private static String s;
    private static String s1;
    private static String s2;

    private static final int T = 1;
    private static final int F = 2;


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        s = input.next();
        s1 = input.next();
        s2 = input.next();

        System.out.println(match(0,0,0) == T ? "yes" : "no");

    }

    private static int match(int i, int i1, int i2) {
        if (memo[i][i1] != 0) {
            return memo[i][i1];
        }

        if (i == s.length()) {
            return memo[i][i1] = i1 + i2 == i ? T : F;
        }

        boolean m1 = i1 < s1.length() && s1.charAt(i1) == s.charAt(i);
        boolean m2 = i2 < s2.length() && s2.charAt(i2) == s.charAt(i);

        int rc;
        if (!m1 && !m2) {
            rc = F;
        }
        else if (m1 && !m2){
            rc  = match(i + 1, i1 + 1, i2);
        }
        else if (m2 && !m1) {
            rc = match(i + 1, i1, i2 + 1);
        }
        else {
            if (match(i  + 1, i1 + 1, i2) == T || match(i + 1, i1, i2 + 1) == T) {
                rc = T;
            }
            else {
                rc = F;
            }
        }

        memo[i][i1] = rc;
        return rc;
    }
}
