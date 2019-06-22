import java.util.*;

public class GivenLengthAndSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int s = in.nextInt();

        if (m == 1 && s == 0) {
            System.out.println("0 0");
            return;
        }

        if (s == 0 || s > m * 9) {
            System.out.println("-1 -1");
            return;
        }

        int[] biggest = new int[m];
        for (int i = 0; i < m; i++) {
            if (s >= 9) {
                biggest[i] = 9;
                s -= 9;
            } else {
                biggest[i] = s;
                break;
            }
        }

        int[] smallest = biggest.clone();
        for (int i = 0; i < m / 2; i++) {
            int temp = smallest[i];
            smallest[i] = smallest[m - i - 1];
            smallest[m - i - 1] = temp;
        }

        if (smallest[0] == 0) {
            smallest[0] = 1;
            for (int i = 1; i < m; i++) {
                if (smallest[i] != 0) {
                    smallest[i]--;
                    break;
                }
            }
        }

        StringBuilder ans = new StringBuilder();

        for (int n : smallest) {
            ans.append(n);
        }
        ans.append(" ");

        for (int n : biggest) {
            ans.append(n);
        }



        System.out.println(ans);


    }
}
