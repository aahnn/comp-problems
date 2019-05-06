import java.util.*;

public class Nirvana {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> products = new ArrayList<>();

        int numDigits = numDigits(n);
        int[] digits = new int[numDigits];
        for (int i = numDigits - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        products.add(digitProduct(digits));
        for (int i = numDigits - 1; i >= 1; i--) {
            digits[i] = 9;
            digits[i - 1]--;
            if (i == 1 && digits[i - 1] == 0) {
                digits[i - 1] = 1;
            }
            products.add(digitProduct(digits));
        }

        System.out.println(Collections.max(products));
    }

    private static int numDigits(int n) {
        if (n == 0) {
            return 1;
        }

        int numDigits = 0;
        while (n != 0) {
            numDigits++;
            n /= 10;
        }
        return numDigits;
    }

    private static int digitProduct(int[] digits) {
        int product = 1;
        for (int digit : digits) {
            product *= digit;
        }
        return product;
    }
}
