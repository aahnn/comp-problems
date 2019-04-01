import java.util.*;

public class ParityAlternated {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(in.nextInt());
        }
        int odd = 0;
        int even = 0;
        for (int i : nums) {
            if (i % 2 == 1) {
                odd++;
            }
            else {
                even++;
            }
        }
        if (even == odd) {
            System.out.println(0);
        }
        else if (even > odd) {
            int numMins = even - odd - 1;
            int sum = 0;
            while (numMins > 0) {
                int minIndex = -1;
                for (int i = 0; i < nums.size(); i++) {
                    if (nums.get(i) % 2 == 0) {
                        minIndex = i;
                    }
                }

                for (int i = 0; i < nums.size(); i++) {
                    int curr = nums.get(i);
                    if (curr % 2 == 0) {
                        if (curr < nums.get(minIndex)) {
                            minIndex = i;
                        }
                    }
                }

                sum += nums.get(minIndex);
                nums.remove(minIndex);
                numMins--;
            }
            System.out.println(sum);
        }
        else {
            int numMins = odd - even - 1;
            int sum = 0;
            while (numMins > 0) {
                int minIndex = -1;
                for (int i = 0; i < nums.size(); i++) {
                    if (nums.get(i) % 2 == 1) {
                        minIndex = i;
                    }
                }

                for (int i = 0; i < nums.size(); i++) {
                    int curr = nums.get(i);
                    if (curr % 2 == 1) {
                        if (curr < nums.get(minIndex)) {
                            minIndex = i;
                        }
                    }
                }

                sum += nums.get(minIndex);
                nums.remove(minIndex);
                numMins--;
            }
            System.out.println(sum);
        }

        // 3 even, 2 odd: 0
        // 2 even, 2 odd: 0
        // 4 even, 2 odd: 1 even, or 2 even
        // 5 even, 2 odd: 2 even, or 3 even
        //test cases: 0
    }
}
