import java.util.*;

public class TheDoors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numDoors = in.nextInt();
        int bestLeft = -1;
        int bestRight = -1;

        for (int i = 0; i < numDoors; i++) {
            if (in.nextInt() == 0) {
                bestLeft = i;
            }
            else {
                bestRight = i;
            }
        }

        System.out.println(Math.min(bestLeft, bestRight) + 1);
    }
}
