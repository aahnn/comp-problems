import java.util.*;

public class BiscuitGenerator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int T = in.nextInt();
        System.out.println(T / A * B);
    }
}
