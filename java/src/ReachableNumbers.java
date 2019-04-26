import java.util.*;

public class ReachableNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Set<Integer> seen = new HashSet<>();
        while (!seen.contains(n)) {
            seen.add(n);
            n += 1;
            while (n % 10 == 0) {
                n /= 10;
            }
        }
        System.out.println(seen.size());
    }
}
