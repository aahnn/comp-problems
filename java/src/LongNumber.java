import java.util.*;

public class LongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String num = in.next();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = num.charAt(i) - '0';
        }

        int[] map = new int[10];
        for (int i = 1; i <= 9; i++) {
            map[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (map[a[i]] > a[i]) {
                while (i < n && map[a[i]] >= a[i]) {
                    a[i] = map[a[i]];
                    i++;
                }
                break;
            }
        }
        StringBuilder out = new StringBuilder();
        for (int i : a) {
            out.append(i);
        }
        System.out.println(out.toString());
    }
}
