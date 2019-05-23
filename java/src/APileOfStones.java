import java.util.*;

public class APileOfStones {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int stones = 0;
        int n = in.nextInt();
        String s = in.next();
        int i = 0;
        while (i < n) {
            while (i < n && s.charAt(i) == '+') {
                stones++;
                i++;
            }
            while (i < n && s.charAt(i) == '-') {
                stones--;
                i++;
            }
            stones = Math.max(stones, 0);
        }

        System.out.println(stones);
    }
}
