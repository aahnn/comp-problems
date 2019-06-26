import java.util.*;

public class DiverseGarland {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();

        if (s.length() <= 1) {
            System.out.println(0);
            System.out.println(s);
            return;
        }
        int changes = 0;
        StringBuilder ans = new StringBuilder();
        ans.append(s.charAt(0));
        for (int i = 1; i < n - 1; i++) {
            if (s.charAt(i) == ans.charAt((i - 1))) {
                changes++;
                ans.append(unique(s.charAt(i - 1), s.charAt(i + 1)));
            } else {
                ans.append(s.charAt(i));
            }
        }

        if (s.charAt(n - 1) == ans.charAt(ans.length() - 1)) {
            ans.append(unique(ans.charAt(ans.length() - 1), ans.charAt(ans.length() - 1)));
            changes++;
        } else {
            ans.append(s.charAt(n - 1));
        }

        System.out.println(changes);
        System.out.println(ans);
    }

    private static char unique(char c1, char c2) {
        if ('R' != c1 && 'R' != c2) {
            return 'R';
        } else if ('G' != c1 && 'G' != c2) {
            return 'G';
        } else {
            return 'B';
        }
    }
}
