import java.util.*;

public class Queue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] q = new int[n];
        for (int i = 0; i < n; i++) {
            q[i] = in.nextInt();
        }

        Arrays.sort(q);
        int served = 0;
        long time = 0;
        for (int i = 0; i < n; i++) {
            if (q[i] >= time) {
                time += q[i];
                served++;
            }
        }

        System.out.println(served);
    }
}
