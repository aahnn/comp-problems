import java.util.*;

public class FrogJumping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long numQueries = input.nextLong();
        StringBuilder ans = new StringBuilder();

        for (long j = 0; j < numQueries; j++) {
            long left = input.nextLong();
            long right = input.nextLong();
            long numJumps = input.nextLong();
            long leftJumps = numJumps / 2;
            long rightJumps = numJumps / 2;
            if (numJumps % 2 == 1) {
                leftJumps++;
            }

            ans.append(left * leftJumps - right * rightJumps);
            ans.append("\n");
        }

        System.out.print(ans);
    }
}
