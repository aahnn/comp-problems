import java.util.*;

public class MemeProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int d = in.nextInt();
            int det = d * d - 4 * d;
            if (det < 0) {
                System.out.println("N");
            }
            else {
                double bigRoot = (d + Math.sqrt(det)) / 2;
                System.out.println("Y " +  bigRoot + " " + (d - bigRoot));
            }
        }
    }
}
