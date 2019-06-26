import java.util.*;

public class GameWithString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        int pairs = 0;
        Stack<Character> chars = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (chars.size() > 0 && chars.peek() == s.charAt(i)) {
                pairs++;
                chars.pop();
            } else {
                chars.push(s.charAt(i));
            }
        }

        System.out.println(pairs % 2 == 1 ? "YES" : "NO");
    }
}
