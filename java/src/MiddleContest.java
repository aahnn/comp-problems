import java.util.*;

public class MiddleContest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String t1 = input.next();
        String t2 = input.next();
        int h1 = Integer.parseInt(t1.substring(0, 2));
        int h2 = Integer.parseInt(t2.substring(0, 2));
        int m1 = Integer.parseInt(t1.substring(3));
        int m2 = Integer.parseInt(t2.substring(3));
        int diff = (m2 + m1 + ((h2 - h1) * 60)) / 2;
        int hours = diff / 60;
        int mins = diff % 60;

        int hOut = h1 + hours;
        System.out.println((hOut / 10 < 1 ? "0" + hOut : hOut) + ":"
                            + (mins / 10 < 1 ? "0" + mins : mins));
    }
}
