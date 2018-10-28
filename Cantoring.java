import java.util.*;

public class Cantoring {
    public static Map<Integer, String> memo = new HashMap<>();
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder ans = new StringBuilder();
        memo.put(0, "-");
        
        while (input.hasNext()) {
            int order = input.nextInt();
            int length = (int) Math.pow(3, order);
            ans.append(cantor(dashes(length)) + "\n");
        }
        System.out.print(ans);
    }
    
    private static String cantor(String dashes) {
        if (dashes.length() == 1) {
            return dashes;
        }
        else {
            int third = dashes.length() / 3;
            return cantor(dashes.substring(0, third)) + blank(third) + cantor(dashes.substring(third * 2));
        }
    }
    
    private static String blank(int length) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < length; i++){
            s.append(" ");
        }
        
        return s.toString();
    }
    
    private static String dashes(int length) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < length; i++){
            s.append("-");
        }
        
        return s.toString();
    }
}
