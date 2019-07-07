import java.util.*;

public class MakeASquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int minSteps = steps(x);
        System.out.println(minSteps < 10 ? minSteps : -1);
    }

    private static int steps(int x) {
        if (isSquare(x)) {
            return 0;
        }
        if (x < 10) {
            return 20;
        }
        StringBuilder s = new StringBuilder(Integer.toString(x));
        int leastSteps = 11;
        for (int i = 0; i < s.length(); i++) {
            StringBuilder c = new StringBuilder(s.toString());
            c.deleteCharAt(i);
            if (c.charAt(0) != '0') {
                leastSteps = Math.min(leastSteps, 1 + steps(Integer.parseInt(c.toString())));
            }
        }

        return leastSteps;
    }

    private static boolean isSquare(int x) {
        if (x <= 0) {
            return false;
        }
        int r = (int) Math.sqrt(x);
        return r * r == x;
    }
}
