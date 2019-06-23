import java.util.*;

public class Drazil {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String a = in.next();

        Map<Character, String> m = new HashMap<>();
        m.put('4', "322");
        m.put('6', "53");
        m.put('8', "7222");
        m.put('9', "7332");


        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) == '0' || a.charAt(i) == '1') {
                continue;
            }

            if (m.containsKey(a.charAt(i))) {
                s.append(m.get(a.charAt(i)));
            } else {
                s.append(a.charAt(i));
            }
        }

        char[] c = s.toString().toCharArray();
        Arrays.sort(c);
        for (int i = 0; i < c.length / 2; i++) {
            char temp = c[i];
            c[i] = c[c.length - 1 - i];
            c[c.length - 1 - i] = temp;
        }

        System.out.println(new String(c));

    }
}
