import java.util.*;

public class MinimizingString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        String s = input.next();

        for (int i = 0; i < len - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                System.out.println(s.substring(0, i) + s.substring(i + 1, len));
                System.exit(0);
            }
        }
        System.out.println(s.substring(0, len - 1));
    }
}
