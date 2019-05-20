import java.util.*;

public class TelephoneNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int t = 0; t < n; t++) {
            int len = in.nextInt();
            String s = in.next();

            int firstIndex = s.indexOf('8');
            if (firstIndex == -1 || len - firstIndex < 11) {
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }
        }
    }
}
