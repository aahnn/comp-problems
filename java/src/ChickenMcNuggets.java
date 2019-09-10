import java.util.*;

public class ChickenMcNuggets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int n = in.nextInt();

        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                for (int k = 0; k <= 100; k++) {
                    int remainder = n - (i * a + b * j + c * k);
                    if (remainder < 0) {
                        continue;
                    }
                    if (remainder % a == 0) {
                        System.out.println((i + remainder / a) + " " + j + " " + k);
                        return;
                    } else if (remainder % b == 0) {
                        System.out.println(i + " " + (j + remainder / b) + " " + k);
                        return;
                    } else if (remainder % c == 0) {
                        System.out.println(i + " " + j + " " + (k + remainder / c));
                        return;
                    }

                }
            }
        }

        System.out.println("IMPOSSIBLE");
    }
}
