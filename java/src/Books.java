import java.util.*;

public class Books {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int right = 0;
        int time = 0;
        int maxBooks = 0;
        for (int left = 0; left < n; left++) {
            while (right < n && time <= t) {
                time += a[right];
                right++;
            }
            int books = right - left;
            if (time > t) {
                books--;
            }
            maxBooks = Math.max(maxBooks, books);
            time -= a[left];
        }

        System.out.println(maxBooks);
    }
}
