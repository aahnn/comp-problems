import java.util.*;

public class NChooseK {
    static int count = 0;
    static String out = "";
    static int m;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int k = in.nextInt();
        m = in.nextInt();

        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        backtrack(chars, 0, 0, new char[k]);
    }

    private static void backtrack(char[] chars, int pos, int idx, char[] comb) {
        if (pos == comb.length) {
            count++;
            if (count == m) {
                out = new String(comb);
                System.out.println(out);
                System.exit(0);
            }
            return;
        }
        for (int i = idx; i < chars.length; i++) {
            comb[pos] = chars[i];
            backtrack(chars, pos + 1, i + 1, comb);
        }
    }
}
