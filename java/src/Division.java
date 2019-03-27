import java.util.*;

public class Division {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n != 0) {
            boolean solutionExists = false;
            for (int fghij = 1234; fghij <= 98765 / n; fghij++) {
                int abcde = fghij * n;
                Set<Integer> distincts = new HashSet<>();
                int aDigits = abcde;
                int fDigits = fghij;
                boolean startZero = false;
                if (fghij < 10000) {
                    distincts.add(-1);
                    startZero = true;
                }
                while (aDigits > 0) {
                    int digit = aDigits % 10;
                    if (!(digit == 0 && startZero)) {
                        distincts.add(digit);
                    }
                    aDigits /= 10;
                }
                while (fDigits > 0) {
                    int digit = fDigits % 10;
                    if (!(digit == 0 && startZero)) {
                        distincts.add(digit);
                    }
                    fDigits /= 10;
                }
                if (distincts.size() == 10) {
                    String fString = (startZero ? "0" : "") + fghij;
                    System.out.println(abcde + " / " + fString +  " = " + n);
                    solutionExists = true;
                }
            }
            if (!solutionExists) {
                System.out.println("There are no solutions for " + n + ".");
            }
            n = in.nextInt();
            if (n != 0) {
                System.out.println();
            }
        }
    }
}
