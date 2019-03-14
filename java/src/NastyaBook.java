import java.util.*;

public class NastyaBook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] rights = new int[n];
        for (int i = 0; i < n; i++) {
            input.nextInt();
            rights[i] = input.nextInt();
        }
        int k = input.nextInt();
        int unreadChaps = 0;
        for (int i = 0; i < n; i++) {
            if (rights[i] >= k) {
                unreadChaps = n - i;
                break;
            }
        }
        System.out.println(unreadChaps);
    }
}
