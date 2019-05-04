import java.util.*;

public class GoodArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        long sum = 0;
        int max = a[0];
        for (int num : a) {
            sum += num;
            max = Math.max(max, num);
        }
        int max2 = -1;
        boolean metMax = false;
        for (int num : a) {
            if (num == max) {
                if (metMax) {
                    max2 = num;
                    break;
                }
                else {
                    metMax = true;
                }
            }
            else {
                max2 = Math.max(max2, num);
            }
        }
        int numGood = 0;
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            int tempMax = max;
            long subSum = sum - a[i];
            if (a[i] == max) {
                tempMax = max2;
            }
            if (subSum == tempMax * 2) {
                out.append(i + 1);
                out.append(" ");
                numGood++;
            }
        }
        System.out.println(numGood);
        System.out.println(out);
    }
}
