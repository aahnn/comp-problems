import java.util.*;

public class CatParty {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] u = new int[11];
        int longest = 0;
        for (int streakLen = 1; streakLen <= n; streakLen++) {
            u[in.nextInt()]++;
            for (int color = 1; color <= 10; color++) {
                if (u[color] != 0) {
                    u[color]--;
                    if (validStreak(u)) {
                        longest = streakLen;
                    }
                    u[color]++;
                }
            }
        }
        System.out.println(longest);
    }

    private static boolean validStreak(int[] u) {
        int numRibbons = 0;
        for (int ribbon : u) {
            if (ribbon != 0) {
                numRibbons = ribbon;
            }
        }

        for (int ribbon : u) {
            if (ribbon != 0 && ribbon != numRibbons) {
                return false;
            }
        }
        return true;
    }
}
