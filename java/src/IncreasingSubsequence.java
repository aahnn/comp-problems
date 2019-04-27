import java.util.*;

public class IncreasingSubsequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = in.nextInt();
        }

        int left = 0;
        int right = n - 1;
        int prev = -1;
        int k = 0;

        StringBuilder moves = new StringBuilder();
        while (left <= right) {
            int leftVal = s[left];
            int rightVal = s[right];
            if (Math.max(leftVal, rightVal) <= prev) {
                System.out.println(k);
                System.out.println(moves.toString());
                return;
            }
            else {
                if (Math.min(leftVal, rightVal) > prev) {
                    if (s[left] < s[right]) {
                        left++;
                        k++;
                        moves.append('L');
                        prev = leftVal;
                    }
                    else if (s[right] < s[left]){
                        right--;
                        k++;
                        moves.append('R');
                        prev = rightVal;
                    }
                    else {
                        StringBuilder leftMoves = new StringBuilder("L");
                        int numLeft = 1;
                        StringBuilder rightMoves = new StringBuilder("R");
                        int numRight = 1;
                        prev = s[left];
                        while (left + numLeft < s.length && s[left + numLeft] > prev) {
                            leftMoves.append("L");
                            prev = s[left + numLeft];
                            numLeft++;
                        }
                        prev = s[right];
                        while (right - numRight >= 0 && s[right - numRight] > prev) {
                            rightMoves.append("R");
                            prev = s[right - numRight];
                            numRight++;
                        }
                        if (numLeft > numRight) {
                            moves.append(leftMoves);
                            System.out.println(k + numLeft);
                            System.out.println(moves);
                            return;
                        }
                        else {
                            moves.append(rightMoves);
                            System.out.println(k + numRight);
                            System.out.println(moves);
                            return;
                        }

                    }
                }
                else {
                    if (s[left] > s[right]) {
                        left++;
                        k++;
                        moves.append('L');
                        prev = leftVal;
                    }
                    else if (s[right] > s[left]){
                        right--;
                        k++;
                        moves.append('R');
                        prev = rightVal;
                    }
                }
            }
        }

        System.out.println(k);
        System.out.println(moves.toString());
    }
}
