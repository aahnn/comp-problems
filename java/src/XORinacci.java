import java.util.*;

public class XORinacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            if (n % 3 == 0) {
                System.out.println(a);
            } else if (n % 3 == 1) {
                System.out.println(b);
            } else {
                System.out.println(a ^ b);
            }
        }
    }
}
