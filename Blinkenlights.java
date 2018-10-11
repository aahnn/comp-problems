import java.util.*;

public class Blinkenlights {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p = input.nextInt();
        int q = input.nextInt();
        int s = input.nextInt();
        
        String out = isSame(p, q, s) ? "yes" : "no";
    
        System.out.println(out);
    }
    
    private static boolean isSame(int p, int q, int s) {
        int origP = p;
        int origQ = q;
        while (p <= s) {
            if (p == q && p >= 1) {
                return true;
            }
            if (p < q) {
                p = p + origP;
            }
            else {
                q = q + origQ;
            }
        }
        
        return false;
    }
}
