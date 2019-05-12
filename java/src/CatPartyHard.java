import java.util.*;

public class CatPartyHard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Integer, Integer> frequencies = new HashMap<>();
        int[] freqCount = new int[n + 1];
        int longest = 0;
        int maxFreq = 0;
        for (int i = 1; i <= n; i++) {
            int color = in.nextInt();
            freqCount[frequencies.getOrDefault(color, 0)]--;
            frequencies.put(color, frequencies.getOrDefault(color, 0) + 1);
            freqCount[frequencies.get(color)]++;
            maxFreq = Math.max(maxFreq, frequencies.get(color));
            if (freqCount[1] == i
                || freqCount[i] == 1
                || freqCount[1] == 1 && maxFreq * freqCount[maxFreq] == (i - 1)
                || freqCount[maxFreq] == 1 && freqCount[maxFreq - 1] * (maxFreq - 1) == i - maxFreq) {
                longest = i;
            }
        }

        System.out.println(longest);
    }
}
