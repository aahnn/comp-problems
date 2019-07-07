import java.util.*;

public class KeanuReeves {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int zeros = 0;
        int ones = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                zeros++;
            } else {
                ones++;
            }
        }

        if (zeros == ones) {
            System.out.println(2);
            System.out.println(s.substring(0, s.length() - 1) + " " + s.substring(s.length() - 1));
        } else {
            System.out.println(1);
            System.out.println(s);
        }
    }
}
