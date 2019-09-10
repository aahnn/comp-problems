import java.util.*;

public class DoorsBreaking {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        if (x > y) {
            System.out.println(n);
        } else {
            int numLess = 0;
            for (int i = 0; i < n; i++) {
                if (in.nextInt() <= x) {
                    numLess++;
                }
            }
            System.out.println((numLess + 1) / 2);

        }
    }
}
