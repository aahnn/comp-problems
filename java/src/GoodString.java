import java.util.*;

public class GoodString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        StringBuilder out = new StringBuilder();
        int numDeletions = 0;
        out.append(s.charAt(0));
        for (int i = 1; i < n; i++) {
            if (out.length() % 2 == 1 && out.charAt(out.length() - 1) == s.charAt(i)) {
                numDeletions++;
            }
            else {
                out.append(s.charAt(i));
            }
        }

        if (out.length() % 2 == 1) {
            out.deleteCharAt(out.length() - 1);
            numDeletions++;
        }
        System.out.println(numDeletions);
        System.out.println(out);
    }
}
