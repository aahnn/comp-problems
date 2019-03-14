import java.util.*;

public class NastyaGames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();

        System.out.println(n + (n + 1) + Math.min(k - 1, n - k) + (n - 1));
    }
}
