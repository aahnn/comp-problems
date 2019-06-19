import java.util.*;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a = in.nextInt();

        System.out.println((long)((n + a - 1) / a) * ((m + a - 1) / a));
    }
}
