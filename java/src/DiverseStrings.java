import java.util.*;

public class DiverseStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String str = in.next();
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            int prev = chars[0];
            boolean isDiverse = true;
            for (int j = 1; j < chars.length; j++) {
                if (chars[j] != prev + 1) {
                    isDiverse = false;
                }
                prev++;
            }
            System.out.println(isDiverse ? "Yes" : "No");
        }
    }
}
