import java.util.*;

public class NauunoAndVots {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        if (x - z > y) {
            System.out.println("+");
        } else if (y - z > x) {
            System.out.println("-");
        } else if (x == y && z == 0) {
            System.out.println("0");
        } else {
            System.out.println("?");
        }
    }
}
