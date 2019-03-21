import java.util.*;

public class MaximalContinuousRest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] schedule = new int[n];

        for (int i = 0; i < n; i++) {
            schedule[i] = in.nextInt();
        }

        int longest = 0;
        int currLongest = 0;
        for (int i = 0; i < n; i++) {
            if (schedule[i] == 1) {
                currLongest++;
                if (i == n - 1) {
                    int leftIn = 0;
                    while (schedule[leftIn] == 1) {
                        currLongest++;
                        leftIn++;
                    }
                }
                longest = Math.max(longest, currLongest);
            }
            else {
                currLongest = 0;
            }
        }

        System.out.println(longest);
    }
}
