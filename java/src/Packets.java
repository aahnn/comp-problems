import java.util.*;

public class Packets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 1;
        int packets = 1;
        while (sum < n) {
            sum = 2 * sum + 1;
            packets++;
        }

        System.out.println(packets);
    }
}
