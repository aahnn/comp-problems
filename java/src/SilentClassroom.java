import java.util.*;

public class SilentClassroom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Character, Integer> firstChars = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            char firstChar = name.charAt(0);
            firstChars.put(firstChar, firstChars.getOrDefault(firstChar, 0) + 1);
        }

        int x = 0;
        for (int i : firstChars.values()) {
            int left = i / 2;
            int right = (i + 1) / 2;
            if (left >= 2) {
                int leftPairs = 1;
                for (int a = left; a > left - 2; a--) {
                    leftPairs *= a;
                }
                x += leftPairs / 2;
            }
            if (right >= 2) {
                int rightPairs = 1;
                for (int a = right; a > right - 2; a--) {
                    rightPairs *= a;
                }
                x += rightPairs / 2;
            }
        }

        System.out.println(x);
    }
}
