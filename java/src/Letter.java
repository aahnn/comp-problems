import java.util.*;

public class Letter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] chars = in.next().toCharArray();

        int capsToRight = 0;
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                capsToRight++;
            }
        }
        int best = capsToRight;

        int lowersToLeft = 0;
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLowerCase(chars[i])) {
                lowersToLeft++;
            }
            if (Character.isUpperCase(chars[i])) {
                capsToRight--;
            }
            best = Math.min(best, lowersToLeft + capsToRight);
        }

        System.out.println(best);
    }
}
