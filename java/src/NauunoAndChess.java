import java.sql.SQLOutput;
import java.util.*;

public class NauunoAndChess {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = n / 2 + 1;
        StringBuilder out = new StringBuilder();
        for (int i = 1; i <= m; i++) {
            out.append(1);
            out.append(" ");
            out.append(i);
            out.append("\n");
        }
        for (int j = 2; j < n - m + 2; j++) {
            out.append(m);
            out.append(" ");
            out.append(j);
            out.append("\n");
        }
        System.out.println(m);
        System.out.println(out);
    }
}
