import java.sql.SQLOutput;
import java.util.*;

public class CreatingCharacter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int str = in.nextInt();
            int intel = in.nextInt();
            int exp = in.nextInt();
            if (intel - str >= exp) {
                System.out.println(0);
            } else if (str - intel > exp) {
                System.out.println(exp + 1);
            }
            else if (exp == 0) {
                System.out.println(1);
            } else {

                int highest = exp;

                int diff = 0;
                int lowest = 0;
                if (str < intel) {
                    diff = intel - str;
                    str += diff;
                    lowest += diff;
                } else {
                    diff = str - intel;
                    intel += diff;
                }
                exp -= diff;
                lowest += exp / 2 + 1;

                System.out.println(highest - lowest + 1);
            }
        }
    }
}

// 8, 5
// 7, 6