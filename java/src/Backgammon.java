import java.util.*;

public class Backgammon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<List<Integer>, Integer> sToI = new HashMap<>();
        int[][] indices = new int[15504][6];

        int i = 0;
        for (int e = 0; e <= 15; e++) {
            for (int d = 0; d <= 15 - e; d++) {
                for (int c = 0; c <= 15 - d - e; c++) {
                    for (int b = 0; b <= 15 - c - d - e; b++) {
                        for (int a = 0; a <= 15 - b - c - d - e; a++) {
                            indices[i] = new int[]{e, d, c, b, a, 15 - a - b - c - d - e};
                            sToI.put(Arrays.asList(e, d, c, b, a, 15 - a - b - c - d - e), i);
                            i++;
                        }
                    }
                }
            }
        }

        String c;
        int curr = 1;
        while (!(c = in.next()).equals("e")) {
            StringBuilder out = new StringBuilder("Case ");
            out.append(curr);
            out.append(": ");
            if (c.equals("m")) {
                List<Integer> l = new ArrayList<>();
                for (int a = 0; a < 6; a++) {
                    l.add(in.nextInt());
                }
                out.append(sToI.get(l));
            } else {
                int[] bla = indices[in.nextInt()];
                for (int a : bla) {
                    out.append(a);
                    out.append(" ");
                }
            }
            curr++;

            System.out.println(out);
        }
    }
}
