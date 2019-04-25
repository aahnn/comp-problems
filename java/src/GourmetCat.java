import java.util.*;

public class GourmetCat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] rations = new int[3];
        for (int i = 0; i < 3; i++) {
            rations[i] = in.nextInt();
        }

        int numWeeks = Math.min(rations[0] / 3, Math.min(rations[1] / 2, rations[2] / 2));
        rations[0] -= numWeeks * 3;
        rations[1] -= numWeeks * 2;
        rations[2] -= numWeeks * 2;

        int[] days = new int[7];
        days[0] = 0;
        days[1] = 1;
        days[2] = 2;
        days[3] = 0;
        days[4] = 2;
        days[5] = 1;
        days[6] = 0;

        int best = 0;
        for (int i = 0; i < 7; i++) {
            int[] copy = rations.clone();
            int numDays = 0;
            int currDay = i;
            while (isValid(copy)) {
                copy[days[currDay]]--;
                currDay++;
                currDay %= 7;
                numDays++;
            }
            best = Math.max(best, numDays - 1);
        }

        System.out.println(numWeeks * 7 + best);
    }

    private static boolean isValid(int[] arr) {
        for (int i : arr) {
            if (i < 0) {
                return false;
            }
        }
        return true;
    }
}
