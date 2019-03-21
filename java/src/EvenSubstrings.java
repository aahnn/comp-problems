import java.util.*;

public class EvenSubstrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        String s = in.next();

        int subCount = 0;
        for (int i = 0; i < length; i++) {
            if (Character.valueOf(s.charAt(i)) % 2 == 0) {
                subCount += i + 1;
            }
        }

        System.out.println(subCount);
    }
}
