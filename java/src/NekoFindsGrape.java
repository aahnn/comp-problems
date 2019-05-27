import java.util.*;

public class NekoFindsGrape {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int numEven = 0;
        int numOdd = 0;
        for (int i = 0; i < m; i++) {
            int key = in.nextInt();
            if (key % 2 == 0) {
                numEven++;
            }
            else {
                numOdd++;
            }
        }

        int even = 0;
        int odd = 0;
        for (int chest : a) {
            if (chest % 2 == 0 && odd < numOdd) {
                odd++;
            }
            else if (chest % 2 == 1 && even < numEven) {
                even++;
            }
        }

        System.out.println(odd + even);
    }
}
