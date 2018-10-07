import java.util.*;

public class Encoding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String code = input.next();
        String s = input.next();
        
        if (code.equals("E")) {
            System.out.println(encode(s));
        }
        else {
            System.out.println(decode(s));
        }
    }
    
    private static String encode(String s) {
        StringBuilder val = new StringBuilder();
        char prev = '\n';
        
        for (int i = 0; i < s.length(); i++) {
            String toAppend;
            int occur = 1;
            while (i < s.length() && s.charAt(i) == prev) {
                occur++;
                i++;
            }
            if (occur != 1) {
                toAppend = "" + occur;
                i--;
            }
            else {
                toAppend = "" + s.charAt(i);
                if (i + 1 < s.length() && s.charAt(i + 1) != s.charAt(i)
                        || i == s.length() - 1) {
                    toAppend += 1;
                }
            }
            val.append(toAppend);
            if (i < s.length())
                prev = s.charAt(i);
        }
        
        return val.toString();
    }
    
    private static String decode(String s) {
        StringBuilder val = new StringBuilder();
        
        for (int i = 0; i < s.length() - 1; i+=2) {
            char curr = s.charAt(i);
            int num = Integer.parseInt(s.substring(i + 1, i + 2));
            for (int n = 0; n < num; n++) {
                val.append(curr);
            }
        }
        
        return val.toString();
    }
}
