import java.util.*;

public class CloningToys {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();

        if (y == 1) {
            System.out.println(x == 0 ? "Yes" : "No");
            return;
        }

        y--;
        x -= y;
        System.out.println(x >= 0 && y >= 0 && x % 2 == 0 ? "Yes" : "No");
    }
}
