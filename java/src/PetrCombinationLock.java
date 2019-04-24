import java.util.*;

public class PetrCombinationLock {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] rotations = new int[n];
        for (int i = 0; i < n; i++) {
            rotations[i] = in.nextInt();
        }

        System.out.println(-760 % 360);
        System.out.println(backtrack(rotations, 0, 0) ? "YES" : "NO");
    }

    private static boolean backtrack(int[] rotations, int i, int currRotation) {
        while (currRotation >= 360) {
            currRotation -= 360;
        }
        while (currRotation <= -360) {
            currRotation += 360;
        }

        if (i == rotations.length) {
            return currRotation == 0;
        }

        return backtrack(rotations, i + 1, currRotation - rotations[i])
                || backtrack(rotations, i + 1, currRotation + rotations[i]);
    }
}
