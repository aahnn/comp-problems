import java.util.*;

public class DisturbedPeople {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numFlats = input.nextInt();
        int[] flats = new int[numFlats];
        for (int i = 0; i < numFlats; i++) {
            flats[i] = input.nextInt();
        }

        int k = 0;
        for (int i = 0; i < numFlats - 2; i++) {
            if (flats[i] == 1 && flats[i + 1] == 0 && flats[i + 2] == 1) {
                flats[i + 2] = 0;
                k++;
            }
        }

        System.out.println(k);
    }
}
