import java.util.*;

public class DivisibilityByEight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] chars = in.next().toCharArray();
        int[] nums = new int[chars.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = chars[i] - '0';
        }
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                for (int k = j + 1; k < len; k++) {
                    int num = nums[i] * 100 + nums[j] * 10 + nums[k];
                    if (num % 8 == 0) {
                        System.out.println("YES");
                        System.out.println(num);
                        return;
                    }
                }
                int num = nums[i] * 10 + nums[j];
                if (num % 8 == 0) {
                    System.out.println("YES");
                    System.out.println(num);
                    return;
                }
            }
            int num = nums[i];
            if (num % 8 == 0) {
                System.out.println("YES");
                System.out.println(num);
                return;
            }
        }
        System.out.println("NO");
    }
}
