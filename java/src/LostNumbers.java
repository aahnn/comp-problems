import java.util.*;

public class LostNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] nums = new int[]{4 , 8, 15, 16, 23, 42};
        Map<Integer, int[]> productMap = new HashMap<>();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                productMap.put(nums[i] * nums[j], new int[]{nums[i], nums[j]});
            }
        }


        System.out.println("? 1 2");
        System.out.flush();
        int[] q1 = productMap.get(in.nextInt());

        System.out.println("? 2 3");
        System.out.flush();
        int[] q2 = productMap.get(in.nextInt());

        System.out.println("? 3 4");
        System.out.flush();
        int[] q3 = productMap.get(in.nextInt());

        System.out.println("? 4 5");
        System.out.flush();
        int[] q4 = productMap.get(in.nextInt());

        int[] ans = new int[6];
        Set<Integer> distincts1 = new HashSet<>();
        distincts1.add(q1[0]);
        distincts1.add(q1[1]);
        int duplicate1 = -1;
        if (distincts1.contains(q2[0])) {
            duplicate1 = q2[0];
        }
        distincts1.add(q2[0]);
        if (distincts1.contains(q2[1])) {
            duplicate1 = q2[1];
        }
        distincts1.add(q2[1]);
        ans[1] = duplicate1;

        Set<Integer> distincts2 = new HashSet<>();
        distincts2.add(q2[0]);
        distincts2.add(q2[1]);
        int duplicate2 = -1;
        if (distincts2.contains(q3[0])) {
            duplicate2 = q3[0];
        }
        distincts2.add(q3[0]);
        if (distincts2.contains(q3[1])) {
            duplicate2 = q3[1];
        }
        distincts2.add(q3[1]);
        ans[2] = duplicate2;

        distincts1.remove(duplicate1);
        distincts1.remove(duplicate2);
        Object[] first = distincts1.toArray();
        ans[0] = (int)first[0];

        Set<Integer> distincts3 = new HashSet<>();
        distincts3.add(q3[0]);
        distincts3.add(q3[1]);
        int duplicate3 = -1;
        if (distincts3.contains(q4[0])) {
            duplicate3 = q4[0];
        }
        distincts3.add(q4[0]);
        if (distincts3.contains(q4[1])) {
            duplicate3 = q4[1];
        }
        distincts3.add(q4[1]);
        ans[3] = duplicate3;

        distincts3.remove(duplicate2);
        distincts3.remove(duplicate3);
        Object[] first2 = distincts3.toArray();
        ans[4] = (int)first2[0];

        Set<Integer> numSet = new HashSet<>(Arrays.asList(4 , 8, 15, 16, 23, 42));
        for (int i = 0; i <= 4; i++) {
            numSet.remove(ans[i]);
        }
        ans[5] = (int)numSet.toArray()[0];
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            out.append(ans[i]);
            out.append(" ");
        }

        System.out.println("! " + out);
    }
}
